package com.paralun.app.config;

import java.math.BigDecimal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    
    @Bean(name = "helloBeanConfig")
    public HelloConfig hello(){
        return new HelloConfigImpl();
    }
    
    @Bean(name = "barangBean")
    public Barang barang(){
        return new Barang("B001","Teh Gelas","Minuman",new BigDecimal("200000"));
    }
}
