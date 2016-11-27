/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean
    public HelloWorld helloWorld() {
        HelloWorld hl = new HelloWorld();
        hl.setNama("Bambang");
        return hl;
    } 
}
