/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.dao;

import com.paralun.app.model.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer>{

    @Override
    public Customer mapRow(ResultSet rs, int i) throws SQLException {
        Customer customer = new Customer();
        customer.setCustId(rs.getInt("cust_id"));
        customer.setCustName(rs.getString("cust_name"));
        customer.setCustAddress(rs.getString("cust_address"));
        customer.setCustAge(rs.getInt("cust_age"));
        return customer;
    }
    
}
