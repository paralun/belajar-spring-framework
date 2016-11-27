/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

public class PersonDaoImpl implements PersonDao{

    @Override
    public void insert() {
        System.out.println("Waktu Insert Data");
    }

    @Override
    public void update() throws Exception {
        System.out.println("Waktu Update Data");
        throw new Exception("Generic Error");
    }

    @Override
    public String getName() {
        System.out.println("Waktu get nama");
        return "Nabilah";
    }

    @Override
    public void delete(String kode) {
        System.out.println("Waktu Update dengan kode :" + kode);
    }

    @Override
    public void insertData(String nama) {
        System.out.println("Waktu Insert data :" + nama);
    }
}
