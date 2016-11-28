/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp1 {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig1.class);
        CustomerBean cb = ctx.getBean(CustomerBean.class);
        System.out.println("Hallo " + cb.getPersonBean().getNama());
    }
    
}
