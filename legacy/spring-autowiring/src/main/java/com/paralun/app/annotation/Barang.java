/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.annotation;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Barang {
    
    private String code;
    private String nama;
    
    @Autowired //by field
    @Qualifier("kategori2")
    private Kategori kategori;
    private BigDecimal harga;

    public Barang() {
    }

    //@Autowired by construtor
    public Barang(Kategori kategori) {
        this.kategori = kategori;
    }
    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Kategori getKategori() {
        return kategori;
    }

    //@Autowired by setter method
    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Barang{" + "code=" + code + ", nama=" + nama + ", kategori=" + kategori + ", harga=" + harga + '}';
    }
}
