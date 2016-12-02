/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example3;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages = "com.paralun.app.example3")
public class AppConfig3 {
    
    @Bean
    @Profile("prod")
    public ContohProfil productionBean() {
        return new ContohProfil("PRODUCTION");
    }
    
    @Bean
    @Profile("dev")
    public ContohProfil developmentBean() {
        return new ContohProfil("DEVELOPMENT");
    }
    
    @Bean(name = "messageSource")
    public MessageSource messageSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasename("messages.test");
        return source;
    }
}
