/*
 * To change this license header, choose License Headers in Project Properties.
 */

package com.paralun.app.coba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author James Kusmambang
 * @since 19/10/2015
 */
@Service
public class BookServiceImpl implements BookService{
    
    @Autowired
    private BookDao bookDao;
    
    /**
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    */

    @Override
    public void printMsg() {
        bookDao.printMsg("Kusmambang");
    }

}
