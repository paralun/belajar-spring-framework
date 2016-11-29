/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example2;

import org.springframework.stereotype.Component;

@Component
public class SayHelloFilter {
     public String filter(String value) {
         return value.toUpperCase();
     }
}
