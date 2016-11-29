/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SayHello {
    
    @Autowired
    private SayHelloFilter filter;
    
    public String hello(String nama) {
        return filter.filter("Hallo " + nama);
    }
}
