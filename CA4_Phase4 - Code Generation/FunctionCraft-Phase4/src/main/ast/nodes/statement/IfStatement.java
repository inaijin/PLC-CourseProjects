package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class IfStatement extends Statement {
    private final ArrayList<Expression> conditions = new ArrayList<>();
    private ArrayList<Statement> thenBody = new ArrayList<>();
    private ArrayList<Statement> elseBody = new ArrayList<>();

    public void addCondition(ArrayList<Expression> condition) {
        this.conditions.addAll(condition);
    }

    public ArrayList<Expression> getConditions() {
        return this.conditions;
    }

    public ArrayList<Statement> getThenBody() {
        return this.thenBody;
    }

    public void setThenBody(ArrayList<Statement> thenBody) {
        this.thenBody = thenBody;
    }

    public ArrayList<Statement> getElseBody() {
        return this.elseBody;
    }

    public void setElseBody(ArrayList<Statement> elseBody) {
        this.elseBody = elseBody;
    }

    @Override
    public String toString() {
        return "IfStatement";
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
