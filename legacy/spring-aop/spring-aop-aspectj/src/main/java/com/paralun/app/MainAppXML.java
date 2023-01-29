/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppXML {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans-xml-config.xml");
        PersonDao dao = (PersonDao) ctx.getBean("personDao");
        dao.insert();
        System.out.println("================================");
        dao.delete("P001");
        System.out.println("================================");
        dao.getName();
        //System.out.println("================================");
        //dao.update();
        System.out.println("================================");
        dao.insertData("Aqua");
    }
    
}
