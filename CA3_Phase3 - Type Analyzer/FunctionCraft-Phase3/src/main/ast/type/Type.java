package main.ast.type;

public abstract class Type {
    public boolean sameType(Type other){
        if(this instanceof NoType)
            return true;
        if(other instanceof NoType)
            return true;
        return this.getClass().equals(other.getClass());
    }
}
