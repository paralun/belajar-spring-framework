/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao {
    
    @Autowired
    private SessionFactory session;

    public Session getSession() {
        return session.getCurrentSession();
    }
    
    public void persist(Object entity) {
        getSession().persist(entity);
    }
    
    public void delete(Object entity) {
        getSession().delete(entity);
    }
    
}
