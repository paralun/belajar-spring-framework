package com.paralun.app.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-di.xml");
        ConstructorDIHelper cdih = (ConstructorDIHelper) context.getBean("beanConstructorHelper");
        cdih.loadMethod();
    }
    
}
