package com.paralun.app.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-di.xml");
        SetterDIHelper sdih = (SetterDIHelper) context.getBean("beanHelper");
        sdih.loadMethod();
    }
    
}
