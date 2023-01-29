/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author SwaHp
 */
public class MainFactory {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "factory-beans.xml", "factory-beans-util.xml");
        
        FactoryBean factory = (FactoryBean) context.getBean("factoryBean");
        System.out.println(factory);
        FactoryBean factoryUtil = (FactoryBean) context.getBean("factoryBeanUtil");
        System.out.println(factoryUtil);
    }
    
}
