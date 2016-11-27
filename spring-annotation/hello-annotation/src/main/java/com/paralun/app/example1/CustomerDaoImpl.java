/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example1;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao{

    @Override
    public void insert() {
        System.out.println("Insert Data");
    }
    
}
