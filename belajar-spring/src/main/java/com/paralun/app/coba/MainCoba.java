package com.paralun.app.coba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author James Kusmambang
 */
public class MainCoba {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-coba.xml");
        BookService service = (BookService) context.getBean("bookServiceImpl");
        service.printMsg();
    }
    
}
