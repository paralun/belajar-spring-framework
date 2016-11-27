/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.model;

public class Customer {
    
    private int custId;
    private String custName;
    private String custAddress;
    private int custAge;

    public Customer() {
    }

    public Customer(int custId, String custName, String custAddress, int custAge) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
        this.custAge = custAge;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public int getCustAge() {
        return custAge;
    }

    public void setCustAge(int custAge) {
        this.custAge = custAge;
    }

    @Override
    public String toString() {
        return "Customer{" + "custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + ", custAge=" + custAge + '}';
    }
}
