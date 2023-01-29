package com.paralun.app.config2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ConfigA.class, ConfigB.class})
public class MainConfig {
    
}
