/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import com.paralun.app.configuration.AppConfig;
import com.paralun.app.model.Barang;
import com.paralun.app.service.BarangService;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
        BarangService service = ctx.getBean("barangService", BarangService.class);
        
        Barang barang1 = new Barang();
        barang1.setKode("B001");
        barang1.setNama("Aqua");
        barang1.setKategori("Minuman");
        barang1.setStok(10);
        barang1.setHarga(new BigDecimal("3000"));
        
        Barang barang2 = new Barang();
        barang2.setKode("B002");
        barang2.setNama("Indomie");
        barang2.setKategori("Makanan");
        barang2.setStok(20);
        barang2.setHarga(new BigDecimal("2000"));
        
        service.simpan(barang1);
        service.simpan(barang2);
        
        List<Barang> list = service.getBarangs();
        for(Barang b : list) {
            System.out.println("ID : " + b.getId());
            System.out.println("Nama : " + b.getNama());
            System.out.println("Kategori : " + b.getKategori());
            System.out.println("Stok : " + b.getStok());
            System.out.println("Harga : " + b.getHarga());
            System.out.println("=============================");
        }
    }
    
}
