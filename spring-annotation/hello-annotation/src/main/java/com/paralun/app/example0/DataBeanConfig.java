/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example0;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBeanConfig {
    
    @Bean
    public DataBean dataBean() {
        DataBean data = new DataBean("James Kusmambang");
        return data;
    }
}
