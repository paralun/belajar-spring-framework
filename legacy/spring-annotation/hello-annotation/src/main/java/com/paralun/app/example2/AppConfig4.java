/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.paralun.app.example2")
public class AppConfig4 {
    
    @Bean("dev")
     public Database development() {
         Database db = new Database("driver", "url", "username", "password");
         return db;
     }
     
     @Bean(name = "prod")
     //@Primary
     public Database production() {
         Database db = new Database("driver1", "url1", "username1", "password1");
         return db;
     }
}
