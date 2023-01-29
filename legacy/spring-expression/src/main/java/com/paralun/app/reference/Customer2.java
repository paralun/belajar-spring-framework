/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.reference;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer2 {
    
    @Value("#{address}")
    private Address2 address;
    @Value("address.country")
    private String country;
    @Value("#{address.getFullAddress('Bambang')}")
    private String fullAddress;

    public Address2 getAddress() {
        return address;
    }

    public void setAddress(Address2 address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @Override
    public String toString() {
        return "Customer2{" + "address=" + address + ", country=" + country + ", fullAddress=" + fullAddress + '}';
    }
}
