package com.paralun.app.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonApp {

    public static void main(String[] args) {
        ApplicationContext contex = new ClassPathXmlApplicationContext("spring-beans-singleton.xml");
        CustomerService serviceA = (CustomerService) contex.getBean("custmerService");
        serviceA.setMessage("Message by ServiceA");
        System.out.println("Message : " + serviceA.getMessage());
        
        CustomerService serviceB = (CustomerService) contex.getBean("custmerService");
        System.out.println("Message : " + serviceB.getMessage());
    }
    
}
