package main.symbolTable.item;

import main.ast.nodes.declaration.PatternDeclaration;
import main.ast.type.Type;
import main.symbolTable.SymbolTable;

public class PatternItem extends SymbolTableItem {
    public static final String START_KEY = "Pattern:";
    private SymbolTable patternSymbolTable;
    private PatternDeclaration patternDeclaration;
    private Type targetVarType;

    public PatternItem(PatternDeclaration patternDeclaration) {
        this.patternDeclaration = patternDeclaration;
        this.name = this.patternDeclaration.getPatternName().getName();
    }

    public Type getTargetVarType() {
        return targetVarType;
    }

    public void setTargetVarType(Type targetVarType) {
        this.targetVarType = targetVarType;
    }

    public SymbolTable getPatternSymbolTable() {
        return patternSymbolTable;
    }

    public void setPatternSymbolTable(SymbolTable patternSymbolTable) {
        this.patternSymbolTable = patternSymbolTable;
    }

    public PatternDeclaration getPatternDeclaration() {
        return patternDeclaration;
    }

    public void setPatternDeclaration(PatternDeclaration patternDeclaration) {
        this.patternDeclaration = patternDeclaration;
    }

    @Override
    public String getKey() {
        return START_KEY + this.name;
    }
}
