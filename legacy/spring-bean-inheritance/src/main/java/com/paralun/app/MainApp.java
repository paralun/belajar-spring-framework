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
                "spring-beans.xml", "spring-beans-abstract.xml");
        Database development = (Database) context.getBean("development");
        System.out.println(development);
        
        Database production = (Database) context.getBean("production");
        System.out.println(production);
        
        Database sit = (Database) context.getBean("sit");
        System.out.println(sit);
    }
}
