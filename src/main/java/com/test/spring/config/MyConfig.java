package com.test.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public MyConfigBean myConfigBean1(){
        return new MyConfigBean();
    }
}
