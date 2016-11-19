package com.paralun.app.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerDao customerDao;

    @Override
    public String toString() {
        return "CustomerService{" + "customerDao=" + customerDao + '}';
    }
}
