package main.compileError.nameErrors;

import main.compileError.CompileError;

public class RedefinitionOfVar extends CompileError {
    String name;
    public RedefinitionOfVar(int line, String name){
        this.line = line;
        this.name = name;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> Redefinition of variable " + this.name;}
}
