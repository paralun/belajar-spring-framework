/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig1 {
    
    @Bean
    public PersonBean personBean1() {
        return new PersonBean("James");
    }
    
    @Bean
    @Primary
    public PersonBean personBean2() {
        return new PersonBean("Kusmambang");
    }
    
    @Bean
    CustomerBean customerBean (PersonBean personBean) {
        return new CustomerBean(personBean);
    }
}
