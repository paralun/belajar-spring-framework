package com.paralun.app.di;

public class SetterDIHelper {
    public SetterDI setterDI;

    public void setSetterDI(SetterDI setterDI) {
        this.setterDI = setterDI;
    }
    
    public void loadMethod(){
        setterDI.printMsg();
    }

}
