/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example3;

import java.util.Locale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainHello {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("in", "ID"));
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig3.class);
        SayHello2 hello2 = ctx.getBean(SayHello2.class);
        hello2.setValue("James Kusmambang");
        hello2.hello();
    }
    
}
