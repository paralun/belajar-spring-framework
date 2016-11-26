/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans-advices.xml");
        CustomerService service = (CustomerService) ctx.getBean("customerServiceProxy");
        System.out.println("*************************");
        service.printName();
        System.out.println("*************************");
        service.printAlamat();
        System.out.println("*************************");
        System.out.println("===================================");
        
        CustomerService service2 = (CustomerService) ctx.getBean("customerServiceProxy2");
        System.out.println("*************************");
        service2.printName();
        System.out.println("*************************");
        service2.printAlamat();
        System.out.println("*************************");
    }
    
}
