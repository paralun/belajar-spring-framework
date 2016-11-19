package com.paralun.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext contex = new ClassPathXmlApplicationContext("spring-beans.xml");
        HelloWorld world = (HelloWorld) contex.getBean("helloBean");
        world.printHello();
        System.out.println("===============================");
        Person person = (Person) contex.getBean("personBean");
        System.out.println("Kode : " + person.getKode());
        System.out.println("Nama : " + person.getNama());
        System.out.println("Alamat : " + person.getAlamat());
    }
    
}
