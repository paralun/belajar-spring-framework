/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp3 {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "dev");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig3.class);
        ContohProfil cp = ctx.getBean(ContohProfil.class);
        System.out.println(cp.getValue());
    }
    
}
