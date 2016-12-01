/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
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
}
