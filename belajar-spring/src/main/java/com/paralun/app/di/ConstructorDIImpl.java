package com.paralun.app.di;

public class ConstructorDIImpl implements ConstructorDI{

    @Override
    public void printMsg() {
        System.out.println("Dependency Injection via Constructor");
    }
    
}
