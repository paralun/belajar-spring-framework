package com.paralun.app.di;

public class ConstructorDIHelper {
    
    public ConstructorDI constructorDI;

    // DI via Constructor
    public ConstructorDIHelper(ConstructorDI constructorDI) {
        this.constructorDI = constructorDI;
    }
    
    public void loadMethod(){
        constructorDI.printMsg();
    }
    
}
