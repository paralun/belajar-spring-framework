/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp4 {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig4.class);
        ConfigBean cb = ctx.getBean(ConfigBean.class);
        System.out.println(cb);
        ConfigBean2 cb2 = ctx.getBean(ConfigBean2.class);
        System.out.println(cb2);
    }
    
}
