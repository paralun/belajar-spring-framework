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
        service.printNama();
        System.out.println("*************************");
        service.printAlamat();
        System.out.println("*************************");
        try {
            service.printThrowException();
        }catch (Exception e){}
    }
    
}
