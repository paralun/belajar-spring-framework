package com.paralun.app.config;

public class HelloConfigImpl implements HelloConfig{

    @Override
    public void printHelloWorld(String msg) {
        System.out.println("Hello : " + msg);
    }
    
}
