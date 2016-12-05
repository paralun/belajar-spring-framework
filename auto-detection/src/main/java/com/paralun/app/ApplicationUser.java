/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import org.springframework.stereotype.Component;

@Component("applicationUser")
public class ApplicationUser {
    
    private String nama = "James Kusmambang";

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "ApplicationUser{" + "nama=" + nama + '}';
    }
}
