/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.viaconstructor;

public class BarangService {
    
    private final BarangDao barangDao;

    public BarangService(BarangDao barangDao) {
        this.barangDao = barangDao;
    }
    
    public void simpanBarang(){
        barangDao.simpanBarang();
    }
}
