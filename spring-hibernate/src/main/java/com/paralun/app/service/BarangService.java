/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.service;

import com.paralun.app.model.Barang;
import java.util.List;

public interface BarangService {
    
    public void simpan(Barang barang);
    public void update(Barang barang);
    public void delete(long id);
    public Barang getBarang(long id);
    public List<Barang> getBarangs();
    
}
