package com.paralun.app.prop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author James Kusmambang
 * @Since 21/10/2015
 */
public class ContohApp {

    public static void main(String[] args) {
        ApplicationContext contex = new ClassPathXmlApplicationContext("spring-beans-prop.xml");
        ContohProp cp = (ContohProp) contex.getBean("contohBean");
        System.out.println(cp.getNama());
        System.out.println(cp.getAlamat());
        System.out.println(cp.getGender());
    }
}
