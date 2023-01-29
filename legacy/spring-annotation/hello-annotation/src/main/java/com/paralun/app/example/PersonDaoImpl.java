/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example;

public class PersonDaoImpl implements PersonDao{

    @Override
    public void insert(String data) {
        System.out.println("Insert data " + data);
    }
}
