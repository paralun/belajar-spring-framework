package com.paralun.app.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsApp {

    public static void main(String[] args) {
        ApplicationContext contex = new ClassPathXmlApplicationContext("spring-beans-collection.xml");
        CustomerEx customer = (CustomerEx) contex.getBean("customerBean");
        System.out.println(customer);
    }
    
}
