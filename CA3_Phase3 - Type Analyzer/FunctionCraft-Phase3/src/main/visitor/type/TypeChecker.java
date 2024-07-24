package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.expression.value.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.type.*;
import main.ast.type.primitiveType.*;
import main.compileError.CompileError;
import main.compileError.typeErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.*;
import main.symbolTable.item.*;
import main.visitor.Visitor;

import java.util.*;
import java.util.function.Consumer;

public class TypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();

    private static <T> void forEachAccept(Iterable<T> elements, Consumer<T> action) {
        if (elements != null && action != null) {
            for (T element : elements) {
                action.accept(element);
            }
        }
    }

    private boolean hasIncompatibleReturnTypes(List<Type> returnTypes) {
        if (!returnTypes.isEmpty()) {
            Type firstType = null;
            for (Type type : returnTypes)
                if(!(type instanceof NoType)) {
                    firstType = type;
                    break;
                }
            for (Type type : returnTypes) {
                if (type == firstType)
                    continue;
                if (!type.sameType(firstType)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean containsNoType(List<Type> returnTypes) {
        for (Type returnType : returnTypes) {
            if (returnType instanceof NoType) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Type visit(Program program){
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();

        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            functionItem.setFunctionSymbolTable(new SymbolTable());
            try {
                SymbolTable.root.put(functionItem);
            }catch (ItemAlreadyExists ignored){}
        }

        for(PatternDeclaration patternDeclaration : program.getPatternDeclarations()){
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try{
                SymbolTable.root.put(patternItem);
            }catch (ItemAlreadyExists ignored){}
        }

        program.getMain().accept(this);

        return null;
    }

    @Override
    public Type visit(FunctionDeclaration functionDeclaration){
        SymbolTable.push(new SymbolTable());
        LinkedList<Type> returnTypes = new LinkedList<>();

        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                    functionDeclaration.getFunctionName().getName());

            functionItem.getFunctionSymbolTable().clearReturnTypes();
            ArrayList<Type> currentArgTypes = functionItem.getArgumentTypes();

            int defaultValsCount = 0;
            LinkedList<Expression> defaultVal = new LinkedList<>();
            LinkedList<Identifier> defaultValNames = new LinkedList<>();

            for (VarDeclaration varDec : functionDeclaration.getArgs())
                if(varDec.getDefaultVal() != null) {
                    defaultVal.add(varDec.getDefaultVal());
                    defaultValNames.add(varDec.getName());
                    defaultValsCount += 1;
                }

            for (int i = 0; i < functionDeclaration.getArgs().size() - defaultValsCount; i++) {
                VarItem argItem = new VarItem(functionDeclaration.getArgs().get(i).getName());
                argItem.setType(currentArgTypes.get(i));
                try {
                    SymbolTable.top.put(argItem);
                    SymbolTable.top.put(functionItem);
                }catch (ItemAlreadyExists ignored){}
            }

            for (int i = 0; i < defaultVal.size(); i++) {
                VarItem argItem = new VarItem(defaultValNames.get(i));
                argItem.setType(defaultVal.get(i).accept(this));
                try {
                    SymbolTable.top.put(argItem);
                    SymbolTable.top.put(functionItem);
                }catch (ItemAlreadyExists ignored){}
            }

            try {
                SymbolTable.top.put(functionItem);
            }catch (ItemAlreadyExists ignored){}

        }catch (ItemNotFound ignored){}

        for(Statement statement : functionDeclaration.getBody())
            statement.accept(this);

        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                    functionDeclaration.getFunctionName().getName());
            returnTypes = functionItem.getFunctionSymbolTable().getReturnTypes();
        }catch (ItemNotFound ignored){}

        if(hasIncompatibleReturnTypes(returnTypes)) {
            typeErrors.add(new FunctionIncompatibleReturnTypes(functionDeclaration.getLine(),
                    functionDeclaration.getFunctionName().getName()));
            SymbolTable.pop();
            return new NoType();
        }

        SymbolTable.pop();
        if(containsNoType(returnTypes))
            return new NoType();
        return returnTypes.getFirst();
    }

    @Override
    public Type visit(PatternDeclaration patternDeclaration){
        SymbolTable.push(new SymbolTable());
        LinkedList<Type> returnTypes = new LinkedList<>();

        try {
            PatternItem patternItem = (PatternItem) SymbolTable.root.getItem(PatternItem.START_KEY +
                    patternDeclaration.getPatternName().getName());
            VarItem varItem = new VarItem(patternDeclaration.getTargetVariable());
            varItem.setType(patternItem.getTargetVarType());
            try {
                SymbolTable.top.put(varItem);
            }catch (ItemAlreadyExists ignored){}

            for(Expression expression : patternDeclaration.getConditions()){
                Type exprType = expression.accept(this);
                if(!(exprType instanceof BoolType) && !(exprType instanceof NoType)){
                    typeErrors.add(new ConditionIsNotBool(expression.getLine()));
                    SymbolTable.pop();
                    return new NoType();
                } else if(exprType instanceof NoType) {
                    SymbolTable.pop();
                    return new NoType();
                }
            }

            for (Expression expression : patternDeclaration.getReturnExp())
                returnTypes.add(expression.accept(this));

            if(hasIncompatibleReturnTypes(returnTypes)) {
                typeErrors.add(new PatternIncompatibleReturnTypes(patternDeclaration.getLine(),
                        patternDeclaration.getPatternName().getName()));
                SymbolTable.pop();
                return new NoType();
            }

        }catch (ItemNotFound ignored){}

        SymbolTable.pop();
        if(containsNoType(returnTypes))
            return new NoType();
        return returnTypes.getFirst();
    }

    @Override
    public Type visit(MainDeclaration mainDeclaration){
        forEachAccept(mainDeclaration.getBody(), stmt -> stmt.accept(this));
        return null;
    }

    @Override
    public Type visit(AccessExpression accessExpression){
        SymbolTable symbolTable = SymbolTable.root;
        String accessedName;
        Type accessedType = null;

        if (accessExpression.getAccessedExpression() instanceof Identifier) {
            accessedName = ((Identifier)accessExpression.getAccessedExpression()).getName();
        } else {
            accessedName = accessExpression.getAccessedExpression().toString();
        }

        if(accessExpression.isFunctionCall()){
            ArrayList<Type> argTypes = new ArrayList<>();

            for (Expression argExpr : accessExpression.getArguments())
                argTypes.add(argExpr.accept(this));

            try {
                try {
                    SymbolTableItem item = SymbolTable.top.getItem("VAR:" + accessedName);
                    if(item instanceof VarItem varItem)
                        if(varItem.getType() instanceof FptrType fptrType)
                            accessedName = fptrType.getFunctionName();
                } catch (ItemNotFound ignored) {}
                SymbolTableItem item = symbolTable.getItem("Function:" + accessedName);
                if (item instanceof FunctionItem calledFuncSymbolTable) {
                    calledFuncSymbolTable.setArgumentTypes(argTypes);
                    return calledFuncSymbolTable.getFunctionDeclaration().accept(this);
                }
            } catch (ItemNotFound ignore) {}
        } else {
            accessedType = accessExpression.getAccessedExpression().accept(this);
            Type dimentionType = accessExpression.getDimentionalAccess().getFirst().accept(this);

            if(!(accessedType instanceof StringType) && !(accessedType instanceof ListType) && !(accessedType instanceof NoType)){
                typeErrors.add(new IsNotIndexable(accessExpression.getLine()));
                return new NoType();
            } else if(accessedType instanceof NoType)
                return new NoType();

            if(!(dimentionType instanceof IntType) && !(dimentionType instanceof NoType)) {
                typeErrors.add(new AccessIndexIsNotInt(accessExpression.getLine()));
                return new NoType();
            } else if(dimentionType instanceof NoType)
                return new NoType();
        }

        if(accessedType instanceof ListType listType)
            return listType.getType();
        return accessedType;
    }

    @Override
    public Type visit(ReturnStatement returnStatement){
        SymbolTable symbolTable = SymbolTable.top;
        SymbolTableItem functionItem = null;

        if (symbolTable != null) {
            for (Map.Entry<String, SymbolTableItem> entry : symbolTable.getItems().entrySet()) {
                if (entry.getKey().startsWith("Function:")) {
                    functionItem = entry.getValue();
                    break;
                }
            }
        }

        if(functionItem instanceof FunctionItem functionItem1) {
            if (returnStatement.hasRetExpression()) {
                Type returnType = returnStatement.getReturnExp().accept(this);
                functionItem1.getFunctionSymbolTable().setReturnTypes(returnType);
                return returnType;
            }
        }

        return null;
    }

    @Override
    public Type visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);
    }

    @Override
    public Type visit(ForStatement forStatement){
        SymbolTable.push(SymbolTable.top.copy());

        Type rangeType = forStatement.getRangeExpression().accept(this);
        VarItem varItem = new VarItem(forStatement.getIteratorId());
        varItem.setType(rangeType);

        try{
            SymbolTable.top.put(varItem);
        }catch (ItemAlreadyExists ignored){}

        for(Statement statement : forStatement.getLoopBodyStmts())
            statement.accept(this);

        SymbolTable.pop();
        return null;
    }

    @Override
    public Type visit(IfStatement ifStatement){
        SymbolTable.push(SymbolTable.top.copy());

        for(Expression expression : ifStatement.getConditions()) {
            Type exprType = expression.accept(this);
            if (!(exprType instanceof BoolType) && !(exprType instanceof NoType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
        }

        for(Statement statement : ifStatement.getThenBody())
            statement.accept(this);

        for(Statement statement : ifStatement.getElseBody())
            statement.accept(this);

        SymbolTable.pop();
        return null;
    }

    @Override
    public Type visit(LoopDoStatement loopDoStatement){
        SymbolTable.push(SymbolTable.top.copy());

        for(Statement statement : loopDoStatement.getLoopBodyStmts())
            statement.accept(this);

        SymbolTable.pop();
        return null;
    }

    @Override
    public Type visit(AssignStatement assignStatement){
        if(assignStatement.isAccessList()){
            Type listType = new NoType();

            try {
                SymbolTableItem item = SymbolTable.top.getItem("VAR:" + assignStatement.getAssignedId().getName());
                if(item instanceof VarItem varItem) {
                    if (!(varItem.getType() instanceof StringType) && !(varItem.getType() instanceof ListType) && !(varItem.getType() instanceof NoType)) {
                        typeErrors.add(new IsNotIndexable(assignStatement.getLine()));
                        return null;
                    }
                    else if(varItem.getType() instanceof ListType listType1)
                        listType = listType1.getType();
                    else if(varItem.getType() instanceof StringType)
                        listType = new StringType();
                }
            } catch (ItemNotFound ignore) {}

            Type assignType = assignStatement.getAccessListExpression().accept(this);
            if (!(assignType instanceof IntType) && !(assignType instanceof NoType)) {
                typeErrors.add(new AccessIndexIsNotInt(assignStatement.getLine()));
                return null;
            }

            if(!assignStatement.getAssignExpression().accept(this).sameType(listType)) {
                typeErrors.add(new IsNotAssignable(assignStatement.getLine()));
                return null;
            }
        } else{
            VarItem newVarItem = new VarItem(assignStatement.getAssignedId());

            Type assignType = assignStatement.getAssignExpression().accept(this);
            newVarItem.setType(assignType);

            try {
                SymbolTable.top.put(newVarItem);
            }catch (ItemAlreadyExists ignored) {
                try {
                    SymbolTableItem foundItm = SymbolTable.top.getItem("VAR:" + newVarItem.getName());
                    if(foundItm instanceof VarItem varItem) {
                        varItem.setType(assignType);
                    }
                } catch (ItemNotFound ignore){}
            }
        }
        return null;
    }

    @Override
    public Type visit(BreakStatement breakStatement){
        for(Expression expression : breakStatement.getConditions()) {
            Type type = expression.accept(this);
            if (!(type instanceof BoolType) && !(type instanceof NoType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
        }
        return null;
    }

    @Override
    public Type visit(NextStatement nextStatement){
        for(Expression expression : nextStatement.getConditions()) {
            Type type = expression.accept(this);
            if (!(type instanceof BoolType) && !(type instanceof NoType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
        }
        return null;
    }

    @Override
    public Type visit(PushStatement pushStatement){
        Type typeInit = pushStatement.getInitial().accept(this);
        Type typeToBeAdded = pushStatement.getToBeAdded().accept(this);

        if(!(typeInit instanceof StringType) || !(typeToBeAdded instanceof StringType)) {
            if (typeInit instanceof ListType listType) {
                if (!listType.getType().sameType(typeToBeAdded)) {
                    typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
                }

                if(listType.getType() instanceof NoType)
                    listType.setType(typeToBeAdded);
            } else if(!(typeInit instanceof StringType) && !(typeInit instanceof NoType))
                typeErrors.add(new IsNotPushedable(pushStatement.getLine()));
            else if(!(typeToBeAdded instanceof StringType) && !(typeToBeAdded instanceof NoType))
                typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
        }

        return null;
    }

    @Override
    public Type visit(PutStatement putStatement){
        putStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Type visit(BoolValue boolValue){return new BoolType();}

    @Override
    public Type visit(IntValue intValue){return new IntType();}

    @Override
    public Type visit(FloatValue floatValue){return new FloatType();}

    @Override
    public Type visit(StringValue stringValue){return new StringType();}

    @Override
    public Type visit(ListValue listValue) {
        LinkedList<Type> listTypes = new LinkedList<>();

        for (Expression expr : listValue.getElements())
            listTypes.add(expr.accept(this));

        if (hasIncompatibleReturnTypes(listTypes)) {
            typeErrors.add(new ListElementsTypesMisMatch(listValue.getLine()));
            return new NoType();
        }

        if(!listTypes.isEmpty()) {
            if(containsNoType(listTypes))
                return new NoType();
            return new ListType(listTypes.getFirst());
        }

        return new ListType(new NoType());
    }

    @Override
    public Type visit(FunctionPointer functionPointer){return new FptrType(functionPointer.getId().getName());}

    @Override
    public Type visit(AppendExpression appendExpression){
        LinkedList<Type> appendedTypes = new LinkedList<>();
        Type appendeeType = appendExpression.getAppendee().accept(this);

        for(Expression appendedExpressions : appendExpression.getAppendeds())
            appendedTypes.add(appendedExpressions.accept(this));

        if(!(appendeeType instanceof ListType) && !(appendeeType instanceof StringType) && !(appendeeType instanceof NoType)){
            typeErrors.add(new IsNotAppendable(appendExpression.getLine()));
            return new NoType();
        } else if(appendeeType instanceof NoType)
            return new NoType();

        if(appendeeType instanceof ListType listType) {
            for (Type types : appendedTypes)
                if (!types.sameType(listType.getType())) {
                    typeErrors.add(new AppendTypesMisMatch(appendExpression.getLine()));
                    return new NoType();
                }
        } else {
            for (Type types : appendedTypes)
                if (!(types instanceof StringType) && !(types instanceof NoType)) {
                    typeErrors.add(new AppendTypesMisMatch(appendExpression.getLine()));
                    return new NoType();
                } else if(types instanceof NoType)
                    return new NoType();
        }

        if(containsNoType(appendedTypes))
            return new NoType();
        return appendeeType;
    }

    private static final Set<BinaryOperator> BOOLEAN_OPERATORS = EnumSet.of(
            BinaryOperator.EQUAL,
            BinaryOperator.NOT_EQUAL,
            BinaryOperator.GREATER_THAN,
            BinaryOperator.LESS_THAN,
            BinaryOperator.LESS_EQUAL_THAN,
            BinaryOperator.GREATER_EQUAL_THAN
    );

    private static final Set<BinaryOperator> OTHER_OPERATORS = EnumSet.of(
            BinaryOperator.PLUS,
            BinaryOperator.MINUS,
            BinaryOperator.MULT,
            BinaryOperator.DIVIDE
    );

    @Override
    public Type visit(BinaryExpression binaryExpression){
        Type firstOp = binaryExpression.getFirstOperand().accept(this);
        Type secondOp = binaryExpression.getSecondOperand().accept(this);

        if(!firstOp.sameType(secondOp)) {
            typeErrors.add(new NonSameOperands(binaryExpression.getLine(), binaryExpression.getOperator()));
            return new NoType();
        }
        else if((firstOp instanceof StringType) || (firstOp instanceof BoolType)) {
            typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getOperator().toString()));
            return new NoType();
        }

        if((firstOp instanceof NoType) || secondOp instanceof NoType)
            return new NoType();

        if (BOOLEAN_OPERATORS.contains(binaryExpression.getOperator())) {
            return new BoolType();
        } else if(OTHER_OPERATORS.contains(binaryExpression.getOperator())) {
            if(firstOp instanceof IntType)
                return new IntType();
            else if(firstOp instanceof FloatType)
                return new FloatType();
        }

        return new NoType();
    }

    @Override
    public Type visit(UnaryExpression unaryExpression){
        Type exp = unaryExpression.getExpression().accept(this);

        if(exp instanceof NoType)
            return new NoType();

        if(exp instanceof StringType) {
            typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), unaryExpression.getOperator().toString()));
            return new NoType();
        }

        if(unaryExpression.getOperator() == UnaryOperator.NOT) {
            if(exp instanceof BoolType)
                return new BoolType();
        } else {
            if(exp instanceof IntType)
                return new IntType();
            else if(exp instanceof FloatType)
                return new FloatType();
        }

        typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), unaryExpression.getOperator().toString()));

        return new NoType();
    }

    @Override
    public Type visit(ChompStatement chompStatement){
        Type chompType = chompStatement.getChompExpression().accept(this);

        if (!(chompType instanceof StringType) && !(chompType instanceof NoType)) {
            typeErrors.add(new ChompArgumentTypeMisMatch(chompStatement.getLine()));
            return new NoType();
        } else if(chompType instanceof NoType)
            return new NoType();

        return new StringType();
    }

    @Override
    public Type visit(ChopStatement chopStatement){
        Type chopType = chopStatement.getChopExpression().accept(this);

        if (!(chopType instanceof StringType) && !(chopType instanceof NoType)) {
            typeErrors.add(new ChopArgumentTypeMisMatch(chopStatement.getLine()));
            return new NoType();
        } else if(chopType instanceof NoType)
            return new NoType();

        return new StringType();
    }

    @Override
    public Type visit(Identifier identifier) {
        SymbolTable symbolTable = SymbolTable.top;
        SymbolTableItem foundItm = null;

        try {
            foundItm = symbolTable.getItem("VAR:" + identifier.getName());
        } catch (ItemNotFound ignore) {}

        if (foundItm instanceof VarItem) {
            return ((VarItem) foundItm).getType();
        }

        return new NoType();
    }

    @Override
    public Type visit(LenStatement lenStatement){
        Type exprType = lenStatement.getExpression().accept(this);

        if(!(exprType instanceof StringType) && !(exprType instanceof ListType) && !(exprType instanceof NoType)) {
            typeErrors.add(new LenArgumentTypeMisMatch(lenStatement.getLine()));
            return new NoType();
        } else if(exprType instanceof NoType)
            return new NoType();

        return new IntType();
    }

    @Override
    public Type visit(MatchPatternStatement matchPatternStatement){
        try{
            PatternItem patternItem = (PatternItem)SymbolTable.root.getItem(PatternItem.START_KEY +
                    matchPatternStatement.getPatternId().getName());
            patternItem.setTargetVarType(matchPatternStatement.getMatchArgument().accept(this));
            return patternItem.getPatternDeclaration().accept(this);
        }catch (ItemNotFound ignored){}

        return null;
    }

    @Override
    public Type visit(RangeExpression rangeExpression){
        RangeType rangeType = rangeExpression.getRangeType();
        LinkedList<Type> types = new LinkedList<>();

        if(rangeType.equals(RangeType.LIST)){
            for(Expression exp : rangeExpression.getRangeExpressions())
                types.add(exp.accept(this));

            if(hasIncompatibleReturnTypes(types)) {
                typeErrors.add(new ListElementsTypesMisMatch(rangeExpression.getLine()));
                return new NoType();
            }

            if(containsNoType(types))
                return new NoType();

            return types.getFirst();
        } else if(rangeType.equals(RangeType.DOUBLE_DOT)) {
            boolean errorAdded = false;

            for (Expression expr : rangeExpression.getRangeExpressions()) {
                Type exprType = expr.accept(this);
                if (!(exprType instanceof IntType) && !(exprType instanceof NoType)) {
                    if (!errorAdded) {
                        typeErrors.add(new IsNotIterable(rangeExpression.getLine()));
                        errorAdded = true;
                    }
                } else if(exprType instanceof NoType)
                    return new NoType();
            }

            if(errorAdded)
                return new NoType();
            else
                return new IntType();
        } else {
            if(rangeExpression.getRangeExpressions().getFirst() instanceof Identifier identifier) {
                try {
                    SymbolTableItem item = SymbolTable.top.getItem("VAR:" + identifier.getName());
                    if (item instanceof VarItem varItem)
                        if (!(varItem.getType() instanceof ListType listType)) {
                            typeErrors.add(new IsNotIterable(rangeExpression.getLine()));
                            return new NoType();
                        } else
                            return listType.getType();
                } catch (ItemNotFound ignore) {}
            }
        }

        return new NoType();
    }
}
