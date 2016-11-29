/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example2;

import java.util.UUID;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.paralun.app.example2")
public class AppConfig2 {
    
    @Bean(name = "bean1")
    @Scope("prototype")
    public ScopeBean scopeBean() {
        String random = UUID.randomUUID().toString();
        return new ScopeBean(random);
    }
}
