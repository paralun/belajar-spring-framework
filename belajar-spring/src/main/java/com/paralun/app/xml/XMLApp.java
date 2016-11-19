package com.paralun.app.xml;

import java.io.File;
import java.io.IOException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLApp {

    public static void main(String[] args) throws IOException {
        File file = new File("dataXML" + File.separator + "customer.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beansXML.xml");
        XMLConverter converter = (XMLConverter) context.getBean("xmlConverterBean");
        
        CustomerXML customer = new CustomerXML();
        customer.setName("mkyong");
	customer.setAge(30);
	customer.setFlag(true);
	customer.setAddress("This is address");
        
        System.out.println("Convert Object to XML!");
        converter.convertFromObjectToXML(customer, file);
        System.out.println("Done \n");
        
        System.out.println("Convert XML back to Object!");
        CustomerXML customer2 = (CustomerXML) converter.convertFromXMLToObject(file);
        System.out.println(customer2);
	System.out.println("Done");
    }
    
}
