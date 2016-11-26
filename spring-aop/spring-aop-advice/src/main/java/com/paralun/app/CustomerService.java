/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

public class CustomerService {

    private String nama;
    private String alamat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void printName() {
        System.out.println("Customer Name : " + nama);
    }

    public void printAlamat() {
        System.out.println("Customer Alamat : " + alamat);
    }
}
