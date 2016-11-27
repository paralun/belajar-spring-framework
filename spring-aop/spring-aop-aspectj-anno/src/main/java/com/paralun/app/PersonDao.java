/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

public interface PersonDao {
    
    public void insert();
    public void update() throws Exception;
    public String getName();
    public void delete(String kode);
    public void insertData(String nama);
}
