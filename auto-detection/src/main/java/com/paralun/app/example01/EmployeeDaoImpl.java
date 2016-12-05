/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example01;

import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void insertData(Employee employee) {
        System.out.println("Simpan data dengan kode " + 
                employee.getKode() + " ke database");
    }
    
}
