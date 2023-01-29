package com.paralun.app.config2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {
    
    @Bean(name = "beanFileA")
    public FileA fileA(){
        return new FileA();
    }
}
