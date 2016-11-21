/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-interface.xml");
        CustomerServiceInterface customer = (CustomerServiceInterface) context.getBean("customerServiceInterface");
        System.out.println(customer);
        context.close();
    }
    
}
