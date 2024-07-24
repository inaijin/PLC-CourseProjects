package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;
import main.symbolTable.utils.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class DependencyDetector extends Visitor<Void> {
    public ArrayList<CompileError> dependencyError = new ArrayList<>();
    private Graph dependencyGraph = new Graph();

    private static <T> void forEachAccept(Iterable<T> elements, Consumer<T> action) {
        if (elements != null && action != null) {
            for (T element : elements) {
                action.accept(element);
            }
        }
    }

    @Override
    public Void visit(Program program){
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();

        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            functionDeclaration.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        String funcName = functionDeclaration.getFunctionName().getName();
        dependencyGraph.addNode(funcName);

        SymbolTable.push(new SymbolTable());

        SymbolTable symbolTable = SymbolTable.top;

        FunctionItem newFunc = new FunctionItem(functionDeclaration);
        try {
            symbolTable.put(newFunc);
        } catch (ItemAlreadyExists ignored) {
        }

        for (Statement stmt : functionDeclaration.getBody()) {
            stmt.accept(this);
        }

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(AccessExpression accessExpression) {
        SymbolTable symbolTable = SymbolTable.top;
        accessExpression.getAccessedExpression().accept(this);
        if (accessExpression.getAccessedExpression() instanceof Identifier funcId) {
            String currentFunction = "";
            for (Map.Entry<String, SymbolTableItem> entry : symbolTable.getItems().entrySet()) {
                if (entry.getValue() instanceof FunctionItem funcItm) {
                    currentFunction = funcItm.getName();
                }
            }
            String accessedFunction = funcId.getName();

            dependencyGraph.addNode(currentFunction);
            dependencyGraph.addNode(accessedFunction);
            dependencyGraph.addEdge(currentFunction, accessedFunction);
        }
        forEachAccept(accessExpression.getArguments(), exp -> exp.accept(this));
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
        } catch(ItemNotFound ignore) {
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
            } catch (ItemAlreadyExists ignore) {
            }
        } else {
            try {
                symbolTable.getItem("VAR:" + assignStatement.getAssignedId().getName());
            } catch (ItemNotFound ignore) {
            }
        }
        if(assignStatement.getAssignExpression() instanceof FunctionPointer) {
            FunctionItem funcItm = new FunctionItem(assignStatement.getAssignedId());
            try {
                symbolTable.put(funcItm);
            } catch (ItemAlreadyExists ignore) {
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
    public Void visit(LambdaExpression lambdaExpression) {
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        for (VarDeclaration varDec : lambdaExpression.getDeclarationArgs()) {
            VarItem varItem = new VarItem(varDec.getName());
            try {
                SymbolTable.top.put(varItem);
            } catch (ItemAlreadyExists ignore) {
            }
        }
        forEachAccept(lambdaExpression.getBody(), exp -> exp.accept(this));
        SymbolTable.pop();
        return null;
    }

    public Void findDependency(){
        for(List<String> circularDependencies : dependencyGraph.findCycles())
            dependencyError.add(new CircularDependency(circularDependencies));
        return null;
    }

}
