/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BarangDao {
    
    //@Autowired
    private Database database;

    @Autowired
    public void setDatabase(@Qualifier("dev") Database database) {
        this.database = database;
    }
    
    public void printDatabase() {
        System.out.println(database);
    }
}
