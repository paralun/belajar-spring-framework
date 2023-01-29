/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeMain {

    public static void main(String[] args) {
       
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig2.class);
        ScopeBean scope1 = ctx.getBean("bean1", ScopeBean.class);
        //scope1.setValue("Bean1");
        System.out.println(scope1.getValue());
        
        ScopeBean scope2 = ctx.getBean("bean1", ScopeBean.class);
        System.out.println(scope2.getValue());
        
        ScopeBean scope3 = ctx.getBean("bean1", ScopeBean.class);
        System.out.println(scope3.getValue());
        scope3.testContex();
    }
    
}
