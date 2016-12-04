/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/config/jdbc.properties")
@ComponentScan(basePackages = "com.paralun.app.example4")
public class AppConfig4 {
    
    @Autowired
    Environment env;
    
    @Bean
    public ConfigBean configBean() {
        ConfigBean cb = new ConfigBean();
        cb.setDriver(env.getProperty("jdbc.driver"));
        cb.setUrl(env.getProperty("jdbc.url"));
        cb.setUser(env.getProperty("jdbc.user"));
        cb.setPass(env.getProperty("jdbc.pass"));
        return cb;
    }
}
