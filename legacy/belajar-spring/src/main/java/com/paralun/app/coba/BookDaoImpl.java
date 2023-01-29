/*
 * To change this license header, choose License Headers in Project Properties.
 */
package com.paralun.app.coba;

import org.springframework.stereotype.Repository;

/**
 * @author James Kusmambang
 * @since 19/10/2015
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void printMsg(String msg) {
        System.out.println("Hallo : " + msg);
    } 
}
