package com.paralun.app.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-auto.xml");
        CustomerService service = (CustomerService) context.getBean("customerService");
        System.out.println(service);
    }
    
}
