package main.ast.nodes.expression;

import main.visitor.IVisitor;

public class MatchPatternStatement extends Expression {
    Expression matchArgument;
    private Identifier patternId;

    public MatchPatternStatement(Identifier patternId, Expression matchArgument) {
        this.matchArgument = matchArgument;
        this.patternId = patternId;
    }

    public Identifier getPatternId() {
        return patternId;
    }

    public void setPatternId(Identifier patternId) {
        this.patternId = patternId;
    }

    public Expression getMatchArgument() {
        return matchArgument;
    }

    public void setMatchArgument(Expression matchArgument) {
        this.matchArgument = matchArgument;
    }

    @Override
    public String toString() {
        return "MatchPattern:" + patternId.getName();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
