/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.viasetter;

public class PersonService {
    
    private PersonDao personDao;
    
    //DI via setter method
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void insert() {
        personDao.insert();
    }
}
