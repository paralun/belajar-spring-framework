/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import com.paralun.app.dao.CustomerDao;
import com.paralun.app.model.Customer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
        CustomerDao dao = (CustomerDao) ctx.getBean("customerDao");
        
        // Insert Data
        Customer customer = new Customer(2, "Mariana", "Cianjur", 26);
        dao.insert(customer);
        
        // getCustomer
        Customer customer1 = dao.getCustomer(2);
        System.out.println(customer1);
        
        // Update
        customer1.setCustName("Mariana Fitriani");
        customer1.setCustAge(12);
        dao.update(customer1);
        
        // getCustomers
        List<Customer> customers = dao.getCustomers();
        for(Customer cus : customers) {
            System.out.println(cus.getCustName());
        }
        
        // delete
        dao.delete(2);
        
        // getName
        System.out.println(dao.getName(1));
        
        // total row
        System.out.println(dao.totalRow());
        
        Customer customer2 = new Customer(2, "Rika Novianti", "Cianjur", 32);
        Customer customer3 = new Customer(3, "Mira Safitri", "Cianjur", 20);
        Customer customer4 = new Customer(4, "Mariana Fitriani", "Cianjur", 12);
        
        List<Customer> list = new ArrayList<>();
        list.add(customer2);
        list.add(customer3);
        list.add(customer4);
        
        dao.insertBatch(list);
    }
    
}
