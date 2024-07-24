package main.compileError.typeErrors;

import main.compileError.CompileError;

public class IsNotAssignable extends CompileError {
    public IsNotAssignable(int line){
        this.line = line;
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> The Assigned Type To A List/String Is Not The Same Type";}
}
