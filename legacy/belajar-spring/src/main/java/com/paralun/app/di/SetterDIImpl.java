package com.paralun.app.di;

public class SetterDIImpl implements SetterDI{

    @Override
    public void printMsg() {
        System.out.println("Dependency Injection via Setter");
    }
    
}
