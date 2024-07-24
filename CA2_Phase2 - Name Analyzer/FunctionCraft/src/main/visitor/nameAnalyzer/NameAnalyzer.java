package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.PatternDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.PatternItem;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;
import java.util.function.Consumer;

import java.util.ArrayList;

public class NameAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> nameErrors = new ArrayList<>();

    private static <T> void forEachAccept(Iterable<T> elements, Consumer<T> action) {
        if (elements != null && action != null) {
            for (T element : elements) {
                action.accept(element);
            }
        }
    }

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();

        //addFunctions
        int duplicateFuncId = 0;
        ArrayList<FunctionItem> funcItems = new ArrayList<>();
        for (FunctionDeclaration funcDec : program.getFunctionDeclarations()) {
            FunctionItem funcItem = new FunctionItem(funcDec);
            try {
                SymbolTable.root.put(funcItem);
                funcItems.add(funcItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfFunction(funcDec.getLine(),
                        funcDec.getFunctionName().getName()));
                duplicateFuncId += 1;
                String freshFuncName = funcItem.getName() +  "#" + String.valueOf(duplicateFuncId);
                Identifier newFuncId = funcDec.getFunctionName();
                newFuncId.setName(freshFuncName);
                funcDec.setFunctionName(newFuncId);
                FunctionItem funcItemNew = new FunctionItem(funcDec);
                funcItems.add(funcItemNew);
                try {
                    SymbolTable.root.put(funcItemNew);
                } catch (ItemAlreadyExists ignored) {
                }
            }
        }

        //addPatterns
        int duplicatePatternId = 0;
        ArrayList<PatternItem> patternItems = new ArrayList<>();
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try {
                SymbolTable.root.put(patternItem);
                patternItems.add(patternItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfPattern(patternDeclaration.getLine(),
                        patternDeclaration.getPatternName().getName()));
                duplicatePatternId += 1;
                String freshName = patternItem.getName() + "#" + String.valueOf(duplicatePatternId);
                Identifier newId = patternDeclaration.getPatternName();
                newId.setName(freshName);
                patternDeclaration.setPatternName(newId);
                PatternItem newItem = new PatternItem(patternDeclaration);
                patternItems.add(newItem);
                try {
                    SymbolTable.root.put(newItem);
                } catch (ItemAlreadyExists ignored) {
                }
            }
        }

        //visitFunctions
        int visitingFuncIndex = 0;
        for (FunctionDeclaration funcDec : program.getFunctionDeclarations()) {
            FunctionItem funcItem = funcItems.get(visitingFuncIndex);
            SymbolTable funcSymbolTable = new SymbolTable();
            funcItem.setFunctionSymbolTable(funcSymbolTable);
            SymbolTable.push(funcSymbolTable);
            funcDec.accept(this);
            SymbolTable.pop();
            visitingFuncIndex += 1;
        }

        //visitPatterns
        int visitingPatternIndex = 0;
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = patternItems.get(visitingPatternIndex);
            SymbolTable patternSymbolTable = new SymbolTable();
            patternItem.setPatternSymbolTable(patternSymbolTable);
            SymbolTable.push(patternSymbolTable);
            patternDeclaration.accept(this);
            SymbolTable.pop();
            visitingPatternIndex += 1;
        }

        //visitMain
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        SymbolTable symbolTable = SymbolTable.top;
        try {
            symbolTable.getItem("VAR:" + identifier.getName());
        } catch (ItemNotFound e) {
            nameErrors.add(new VariableNotDeclared(identifier.getLine(), identifier.getName()));
        }
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        if(varDeclaration.getDefaultVal() != null)
            varDeclaration.getDefaultVal().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        SymbolTable symbolTable = SymbolTable.top;
        for(VarDeclaration varDec : functionDeclaration.getArgs()) {
            if(varDec.getName().getName().equals(functionDeclaration.getFunctionName().getName()))
                nameErrors.add(new IdenticalArgFunctionName(functionDeclaration.getLine(),
                        functionDeclaration.getFunctionName().getName()));
        }

        for(VarDeclaration varDec : functionDeclaration.getArgs()) {
            VarItem varItem = new VarItem(varDec.getName());
            varItem.setIsArg(Boolean.TRUE);
            if(varDec.getDefaultVal() != null)
                varItem.setDefaultVal(varDec.getDefaultVal());
            try {
                symbolTable.put(varItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfVar(varDec.getLine(),
                        varDec.getName().getName()));
            }
            varDec.accept(this);
        }

        for(Statement stmt : functionDeclaration.getBody())
            stmt.accept(this);

        return null;
    }

    @Override
    public Void visit(PatternDeclaration patternDeclaration) {
        SymbolTable symbolTable = SymbolTable.top;
        VarItem varItm = new VarItem(patternDeclaration.getTargetVariable());
        try {
            symbolTable.put(varItm);
        } catch (ItemAlreadyExists e) {
            nameErrors.add(new RedefinitionOfVar(patternDeclaration.getLine(),
                    patternDeclaration.getPatternName().getName()));
        }
        forEachAccept(patternDeclaration.getConditions(), exp -> exp.accept(this));
        forEachAccept(patternDeclaration.getReturnExp(), exp -> exp.accept(this));
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        forEachAccept(mainDeclaration.getBody(), exp -> exp.accept(this));
        return null;
    }

    @Override
    public Void visit(ReturnStatement returnStatement) {
        if(returnStatement.hasRetExpression())
            returnStatement.getReturnExp().accept(this);
        return null;
    }

    @Override
    public Void visit(IfStatement ifStatement) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        forEachAccept(ifStatement.getConditions(), exp -> exp.accept(this));
        forEachAccept(ifStatement.getThenBody(), exp -> exp.accept(this));
        SymbolTable.pop();
        if (ifStatement.getElseBody() != null) {
            SymbolTable.push(new SymbolTable(SymbolTable.top));
            forEachAccept(ifStatement.getElseBody(), exp -> exp.accept(this));
            SymbolTable.pop();
        }
        return null;
    }

    @Override
    public Void visit(PutStatement putStatement) {
        putStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(LenStatement lenStatement) {
        lenStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(PushStatement pushStatement) {
        pushStatement.getInitial().accept(this);
        pushStatement.getToBeAdded().accept(this);
        return null;
    }

    @Override
    public Void visit(LoopDoStatement loopDoStatement) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        forEachAccept(loopDoStatement.getLoopBodyStmts(), exp -> exp.accept(this));
        forEachAccept(loopDoStatement.getLoopConditions(), exp -> exp.accept(this));
        if(loopDoStatement.getLoopRetStmt() != null)
            loopDoStatement.getLoopRetStmt().accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ForStatement forStatement) {
        VarItem varItm = new VarItem(forStatement.getIteratorId());
        try {
            SymbolTable.top.put(varItm);
        } catch (ItemAlreadyExists e) {
            nameErrors.add(new RedefinitionOfVar(forStatement.getLine(),
                    forStatement.getIteratorId().getName()));
        }
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        forEachAccept(forStatement.getRangeExpressions(), exp -> exp.accept(this));
        forEachAccept(forStatement.getLoopBodyExpressions(), exp -> exp.accept(this));
        forEachAccept(forStatement.getLoopBody(), exp -> exp.accept(this));
        if(forStatement.getReturnStatement() != null)
            forStatement.getReturnStatement().accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MatchPatternStatement matchPatternStatement) {
        SymbolTable symbolTable = SymbolTable.root;

        try {
            symbolTable.getItem("Pattern:" + matchPatternStatement.getPatternId().getName());
        } catch(ItemNotFound e) {
            nameErrors.add(new PatternNotDeclared(matchPatternStatement.getLine(),
                    matchPatternStatement.getPatternId().getName()));
        }

        matchPatternStatement.getMatchArgument().accept(this);
        return null;
    }

    @Override
    public Void visit(ChopStatement chopStatement) {
        chopStatement.getChopExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(ChompStatement chompStatement) {
        chompStatement.getChompExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(AssignStatement assignStatement) {
        SymbolTable symbolTable = SymbolTable.top;
        if(!assignStatement.isAccessList()) {
            VarItem varItm = new VarItem(assignStatement.getAssignedId());
            try {
                symbolTable.put(varItm);
            } catch (ItemAlreadyExists ignore) {}
        } else {
            try {
                symbolTable.getItem("VAR:" + assignStatement.getAssignedId().getName());
            } catch (ItemNotFound e) {
                nameErrors.add(new VariableNotDeclared(assignStatement.getLine(),
                        assignStatement.getAssignedId().getName()));
            }
        }
        if(assignStatement.getAssignExpression() instanceof FunctionPointer) {
            FunctionItem funcItm = new FunctionItem(assignStatement.getAssignedId());
            try {
                symbolTable.put(funcItm);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfVar(assignStatement.getLine(),
                        assignStatement.getAssignedId().getName()));
            }
        }
        assignStatement.getAssignExpression().accept(this);
        if(assignStatement.isAccessList())
            assignStatement.getAccessListExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        expressionStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(AppendExpression appendExpression) {
        appendExpression.getAppendee().accept(this);
        forEachAccept(appendExpression.getAppendeds(), exp -> exp.accept(this));
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        unaryExpression.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(AccessExpression accessExpression) {
        SymbolTable symbolTable = SymbolTable.root;

        String accessedName;
        if (accessExpression.getAccessedExpression() instanceof Identifier) {
            accessedName = ((Identifier)accessExpression.getAccessedExpression()).getName();
        } else {
            accessedName = accessExpression.getAccessedExpression().toString();
        }
        if(accessExpression.isFunctionCall()) {
            try {
                SymbolTableItem item = symbolTable.getItem("Function:" + accessedName);
                if (item instanceof FunctionItem calledFuncSymbolTable) {
                    if (calledFuncSymbolTable.getFunctionSymbolTable() != null) {
                        if (accessExpression.getArguments().size() > calledFuncSymbolTable.getFunctionSymbolTable().rangeFuncArglen().getFirst()
                                || accessExpression.getArguments().size() < calledFuncSymbolTable.getFunctionSymbolTable().rangeFuncArglen().getLast())
                            nameErrors.add(new ArgMisMatch(accessExpression.getLine(), accessedName));
                    }
                }
            } catch (ItemNotFound e) {
                try {
                    SymbolTable.top.getItem("Function:" + accessedName);
                } catch (ItemNotFound e2) {
                if(!accessedName.equals("LambdaExpression"))
                    nameErrors.add(new FunctionNotDeclared(accessExpression.getLine(), accessedName));
                }
            }
        } else {
            accessExpression.getAccessedExpression().accept(this);
        }

        forEachAccept(accessExpression.getArguments(), exp -> exp.accept(this));
        forEachAccept(accessExpression.getDimentionalAccess(), exp -> exp.accept(this));
        return null;
    }

    @Override
    public Void visit(LambdaExpression lambdaExpression) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        for (VarDeclaration varDec : lambdaExpression.getDeclarationArgs()) {
            VarItem varItem = new VarItem(varDec.getName());
            try {
                SymbolTable.top.put(varItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfVar(varDec.getLine(),
                        varDec.getName().getName()));
            }
        }
        forEachAccept(lambdaExpression.getBody(), exp -> exp.accept(this));
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ListValue listValue) {
        forEachAccept(listValue.getElements(), exp -> exp.accept(this));
        return null;
    }

    @Override
    public Void visit(FunctionPointer functionPointer) {
        SymbolTable symbolTable = SymbolTable.root;
        try {
            symbolTable.getItem("Function:" + functionPointer.getId().getName());
        } catch (ItemNotFound e) {
            nameErrors.add(new FunctionNotDeclared(functionPointer.getLine(),
                    functionPointer.getId().getName()));
        }
        return null;
    }

}
