package com.paralun.app.config2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigB {
    
    @Bean(name = "beanFileB")
    public FileB fileB(){
        return new FileB();
    }
}
