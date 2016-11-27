/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.dao;

import com.paralun.app.model.Customer;
import java.util.List;

public interface CustomerDao {
    
    public void insert(Customer customer);
    public void update(Customer customer);
    public void delete(int id);
    public Customer getCustomer(int id);
    public String getName(int id);
    public List<Customer> getCustomers();
    public int totalRow();
    public void insertBatch(List<Customer> customers);
}
