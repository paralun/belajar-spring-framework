/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring-beans.xml", "spring-beans-custom.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);
        
        Customer customer1 = (Customer) context.getBean("customCustomer");
        System.out.println(customer1);
    }
    
}
