/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("alamat")
public class Alamat {
    
    @Value("Bandung")
    private String kota;
    @Value("Jawa Barat")
    private String provinsi;

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    @Override
    public String toString() {
        return "Alamat{" + "kota=" + kota + ", provinsi=" + provinsi + '}';
    }
}
