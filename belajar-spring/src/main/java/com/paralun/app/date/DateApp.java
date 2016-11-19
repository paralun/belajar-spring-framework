package com.paralun.app.date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DateApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-date.xml");
        DateExample dateExample = (DateExample) context.getBean("dateBean");
        System.out.println(dateExample);
    }
    
}
