/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
    
    final private MessageService service;
    
    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }
    
    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
