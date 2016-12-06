/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.service;

import com.paralun.app.model.Barang;
import com.paralun.app.repository.BarangDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("barangService")
@Transactional
public class BarangServiceImpl implements BarangService {
    
    @Autowired
    private BarangDao dao;

    @Override
    public void simpan(Barang barang) {
        dao.simpan(barang);
    }

    @Override
    public void update(Barang barang) {
        dao.update(barang);
    }

    @Override
    public void delete(long id) {
        dao.delete(id);
    }

    @Override
    public Barang getBarang(long id) {
        return dao.getBarang(id);
    }

    @Override
    public List<Barang> getBarangs() {
        return dao.getBarangs();
    }
    
}
