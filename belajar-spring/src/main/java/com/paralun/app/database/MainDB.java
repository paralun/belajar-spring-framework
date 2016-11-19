package com.paralun.app.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author James Kusmambang
 */
public class MainDB {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-db.xml");
        CustomerDBDao dao = (CustomerDBDao) context.getBean("customerDao");
        CustomerDB cdb = new CustomerDB();
        cdb.setCustId(1);
        cdb.setNama("Haryono");
        cdb.setUmur(33);
        
        dao.insert(cdb);
    }
    
}
