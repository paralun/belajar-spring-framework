package com.paralun.app.database;

public interface CustomerDBDao {
    
    public void insert(CustomerDB cdb);
    public CustomerDB getByID(int id);
}
