package main.symbolTable.item;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.ast.type.Type;

public class VarItem extends SymbolTableItem {
    public static String START_KEY = "VAR:";
    private Type type;
    private Boolean isArg;
    private Type listType;
    private Expression defaultVal;

    public VarItem(Identifier identifier) {
        this.name = identifier.getName();
        this.defaultVal = null;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getListType() {
        return listType;
    }

    public void setListType(Type type) {
        listType = type;
    }

    public void setIsArg(Boolean constant) {
        isArg = constant;
    }

    public Boolean isArg() {
        return isArg == Boolean.TRUE;
    }

    public void setDefaultVal(Expression val) { this.defaultVal = val; }
    public Boolean isDefaultVal() { return this.defaultVal != null; }

    @Override
    public String getKey() {
        return START_KEY + this.name;
    }
}
