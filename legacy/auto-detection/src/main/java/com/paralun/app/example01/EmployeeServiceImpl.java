/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeDao dao;

    @Override
    public void insertData(Employee employee) {
        dao.insertData(employee);
    }
}
