/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("siswa")
public class Siswa {
    
    @Value("Mirna")
    private String nama;
    @Value("#{alamat.kota}")
    private String kota;
    @Value("#{alamat}")
    private Alamat alamat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Siswa{" + "nama=" + nama + ", kota=" + kota + ", alamat=" + alamat + '}';
    }
}
