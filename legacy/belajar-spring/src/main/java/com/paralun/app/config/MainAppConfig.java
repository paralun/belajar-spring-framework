package com.paralun.app.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppConfig {

    public static void main(String[] args) {
        ApplicationContext contex = new AnnotationConfigApplicationContext(SpringConfig.class);
        HelloConfig hello = (HelloConfig) contex.getBean("helloBeanConfig");
        hello.printHelloWorld("James Kusmambang");
        System.out.println("================================");
        Barang barang = (Barang) contex.getBean("barangBean");
        System.out.println("Kode : " + barang.getKode());
        System.out.println("Nama : " + barang.getNama());
        System.out.println("Kategori : " + barang.getKategori());
        System.out.println("Harga : " + barang.getHarga());
    }
    
}
