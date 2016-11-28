/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
                ApplicationConfiguration.class);
        //DataBean bean = ctx.getBean(DataBean.class);
        //System.out.println("Hello " + bean.getValue());
        SampleDI di = ctx.getBean(SampleDI.class);
        System.out.println("Hello " + di.getDataBean().getValue());
    }
    
}
