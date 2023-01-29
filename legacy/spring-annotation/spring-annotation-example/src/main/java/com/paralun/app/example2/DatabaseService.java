/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService {
    
    @PostConstruct
    public void openConnection() {
        System.out.println("OPEN CONNECTION");
    }
    
    @PreDestroy
    public void closeConnection() {
        System.out.println("CLOSE CONNECTION");
    }
}
