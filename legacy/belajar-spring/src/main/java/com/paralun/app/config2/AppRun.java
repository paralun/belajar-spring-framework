package com.paralun.app.config2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRun {

    public static void main(String[] args) {
        ApplicationContext contex = new AnnotationConfigApplicationContext(MainConfig.class);
        FileA fileA = (FileA) contex.getBean("beanFileA");
        fileA.printMsg("Ini adalah");
        
        FileB fileB = (FileB) contex.getBean("beanFileB");
        fileB.printMsg("Aku adalah");
    }
    
}
