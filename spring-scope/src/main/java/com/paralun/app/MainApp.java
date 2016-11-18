/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("hello");
        objA.setMessage("I'm object A");
        objA.getMessage();
        
        HelloWorld objB = (HelloWorld) context.getBean("hello");
        objB.getMessage();
        
        
    }
    
}
