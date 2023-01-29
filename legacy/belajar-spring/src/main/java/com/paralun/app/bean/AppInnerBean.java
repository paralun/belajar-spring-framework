package com.paralun.app.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInnerBean {

    public static void main(String[] args) {
        ApplicationContext contex = new ClassPathXmlApplicationContext(new String[]{"spring-beans-inner.xml"});
        CustomerInnerBean customer = (CustomerInnerBean) contex.getBean("customerBean");
        System.out.println(customer);
    }
    
}
