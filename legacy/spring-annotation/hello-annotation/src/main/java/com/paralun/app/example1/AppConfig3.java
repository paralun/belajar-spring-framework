/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.paralun.app.example1")
public class AppConfig3 {
    
//    @Bean
//    public CustomerService customerService() {
//        CustomerService cs = new CustomerService();
//        cs.setCustomerDao(new CustomerDaoImpl());
//        return cs;
//    }
}
