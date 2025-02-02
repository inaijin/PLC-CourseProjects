package main.ast.type.primitiveType;

import main.ast.type.Type;

public class StringType extends Type {
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        return obj != null && getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return 4;
    }

    @Override
    public String toString() {
        return "StringType";
    }
}
