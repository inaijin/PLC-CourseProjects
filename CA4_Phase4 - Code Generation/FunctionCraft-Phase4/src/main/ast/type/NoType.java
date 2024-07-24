package main.ast.type;

public class NoType extends Type {
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        return obj != null && getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return 5;
    }

    @Override
    public String toString() {
        return "NoType";
    }
}
