/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp01 {

    public static void main(String[] args) {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService service = (EmployeeService) ctx.getBean("employeeService");
        
        Employee employee = new Employee();
        employee.setKode("001");
        employee.setNama("James Kusmambang");
        employee.setDepartement("Programmer");
        service.insertData(employee);
    }
    
}
