/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.reference;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address")
public class Address2 {
    
    @Value("Jl. Cibeunying Kidul Bandung")
    private String street;
    @Value("73644")
    private int postcode;
    @Value("Indonesia")
    private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getFullAddress(String prefix) {
        return prefix + " : " + street + " " + postcode + " " + country;
    }

    @Override
    public String toString() {
        return "Address2{" + "street=" + street + ", postcode=" + postcode + ", country=" + country + '}';
    }
}
