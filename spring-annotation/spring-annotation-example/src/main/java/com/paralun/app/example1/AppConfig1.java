/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig1 {
    
    @Bean(name = "bean1")
    public PersonBean personBean1() {
        return new PersonBean("James");
    }
    
    @Bean(name = "bean2")
    //@Primary
    public PersonBean personBean2() {
        return new PersonBean("Kusmambang");
    }
    
    @Bean
    public CustomerBean customerBean(@Qualifier("bean2") PersonBean personBean) {
        return new CustomerBean(personBean);
    }
    
    @Bean
    public TransaksiBean transaksiBean(@Qualifier("bean1") PersonBean personBean, CustomerBean customerBean) {
        return new TransaksiBean(personBean, customerBean);
    }
}
