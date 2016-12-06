/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.repository;

import com.paralun.app.model.Barang;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("barangDao")
public class BarangDaoImpl extends AbstractDao implements BarangDao {

    @Override
    public void simpan(Barang barang) {
        persist(barang);
    }

    @Override
    public void update(Barang barang) {
        getSession().update(barang);
    }

    @Override
    public void delete(long id) {
        Query query = getSession().createQuery("delete from t_barang where id = :id");
        query.setLong("id", id);
        query.executeUpdate();
    }

    @Override
    public Barang getBarang(long id) {
        Criteria criteria = getSession().createCriteria(Barang.class);
        criteria.add(Restrictions.eq("id", id));
        return (Barang) criteria.uniqueResult();
    }

    @Override
    public List<Barang> getBarangs() {
        Criteria criteria = getSession().createCriteria(Barang.class);
        return (List<Barang>) criteria.list();
    }
    
}
