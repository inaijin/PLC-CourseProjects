package main.ast.nodes.expression;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class AccessExpression extends Expression {
    private Expression accessedExpression;
    private boolean isFunctionCall;
    private ArrayList<Expression> arguments = new ArrayList<>();
    private ArrayList<Expression> dimentionalAccess = new ArrayList<>();

    public AccessExpression(Expression accessedExpression, ArrayList<Expression> arguments) {
        this.accessedExpression = accessedExpression;
        this.arguments = arguments;
        this.isFunctionCall = false;
    }

    public void setIsFunctionCall(boolean isFunctionCall) {
        this.isFunctionCall = isFunctionCall;
    }

    public boolean isFunctionCall() {
        return isFunctionCall;
    }

    public Expression getAccessedExpression() {
        return accessedExpression;
    }

    public void setAccessedExpression(Expression accessedExpression) {
        this.accessedExpression = accessedExpression;
    }

    public ArrayList<Expression> getDimentionalAccess() {
        return dimentionalAccess;
    }

    public void setDimentionalAccess(ArrayList<Expression> dimentionalAccess) {
        this.dimentionalAccess = dimentionalAccess;
    }

    public ArrayList<Expression> getArguments() {
        return arguments;
    }

    public void setArguments(ArrayList<Expression> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "AccessExpression";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
