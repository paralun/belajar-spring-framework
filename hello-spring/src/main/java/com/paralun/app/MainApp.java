/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        //ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/spring-beans.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.printHello();
        
    }
    
}
