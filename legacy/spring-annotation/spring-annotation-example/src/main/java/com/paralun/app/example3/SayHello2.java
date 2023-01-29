/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example3;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

@Component("sayHello2")
public class SayHello2 implements MessageSourceAware{
    
    private MessageSource source;
    private String value;

    public SayHello2() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void setMessageSource(MessageSource source) {
        this.source = source;
    }
    
//    public void hello() {
//        System.out.println(source.getMessage("hello", null, Locale.getDefault()) + value);
//    }
    
    // Menggunakan parameter
    public void hello() {
        System.out.println(source.getMessage("hello", new Object[]{
            value}, Locale.getDefault()));
    }
}
