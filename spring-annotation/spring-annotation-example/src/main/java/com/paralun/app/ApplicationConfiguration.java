/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    
    @Bean
    public DataBean dataBean() {
        DataBean db = new DataBean("James Kusmambang");
        return db;
    }
    
    @Bean
    public SampleDI sampleDI(DataBean dataBean) {
        SampleDI di = new SampleDI(dataBean);
        return di;
    }
    
}
