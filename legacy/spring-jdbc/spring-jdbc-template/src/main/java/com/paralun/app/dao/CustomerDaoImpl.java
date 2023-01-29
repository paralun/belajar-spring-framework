/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.dao;

import com.paralun.app.model.Customer;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDaoImpl implements CustomerDao{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insert(Customer customer) {
        String sql = "insert into customer (cust_id, cust_name, cust_address, cust_age) values (?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
            customer.getCustId(), customer.getCustName(), customer.getCustAddress(), customer.getCustAge()});
    }

    @Override
    public void update(Customer customer) {
        String sql = "update customer set cust_name = ?, cust_address = ?, cust_age = ? where cust_id = ?";
        jdbcTemplate.update(sql, new Object[]{
            customer.getCustName(), customer.getCustAddress(), customer.getCustAge(), customer.getCustId()});
    }

    @Override
    public void delete(int id) {
        String sql = "delete from customer where cust_id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Customer getCustomer(int id) {
        String sql = "select * from customer where cust_id = ?";
        Customer customer = jdbcTemplate.queryForObject(sql, new Object[]{id}, new CustomerRowMapper());
        return customer;
    }

    @Override
    public List<Customer> getCustomers() {
        String sql = "select * from customer";
        List<Customer> list = jdbcTemplate.query(sql, new CustomerRowMapper());
        return list;
    }

    @Override
    public String getName(int id) {
        String sql = "select cust_name from customer where cust_id = ?";
        String nama = jdbcTemplate.queryForObject(sql, new Object[]{id}, String.class);
        return nama;
    }

    @Override
    public int totalRow() {
        String sql = "select count(*) from customer";
        int total = jdbcTemplate.queryForObject(sql, Integer.class);
        return total;
    }

    @Override
    public void insertBatch(List<Customer> customers) {
        String sql = "insert into customer (cust_id, cust_name, cust_address, cust_age) values (?,?,?,?)";
        jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                Customer customer = customers.get(i);
                ps.setInt(1, customer.getCustId());
                ps.setString(2, customer.getCustName());
                ps.setString(3, customer.getCustAddress());
                ps.setInt(4, customer.getCustAge());
            }

            @Override
            public int getBatchSize() {
                return customers.size();
            }
        });
    }

}
