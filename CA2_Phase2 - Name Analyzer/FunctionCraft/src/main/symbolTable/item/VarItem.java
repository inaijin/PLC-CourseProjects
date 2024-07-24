package main.symbolTable.item;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;

public class VarItem extends SymbolTableItem{
    private Expression defaultVal;
    private Boolean isArg = false;
    public static String START_KEY = "VAR:";
    public VarItem(Identifier identifier){
        this.name = identifier.getName();
        this.defaultVal = null;
    }
    @Override
    public String getKey(){return START_KEY + this.name;}
    public void setDefaultVal(Expression val) { this.defaultVal = val; }
    public Boolean isDefaultVal() { return this.defaultVal != null; }
    public void setIsArg(Boolean value) {this.isArg = value; }
    public Boolean isArg() { return this.isArg; }
}
