/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ScopeBean implements ApplicationContextAware {
    
    private String value;
    private ApplicationContext context;

    public ScopeBean(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }
    
    public void testContex() {
        if(context != null) {
            System.out.println("Context ada");
        }else{
            System.out.println("Context tidak ada");
        }
    }
}
