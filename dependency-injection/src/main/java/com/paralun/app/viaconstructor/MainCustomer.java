/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.viaconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCustomer {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ambiguities.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);
    }
    
}
