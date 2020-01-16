package com.learning.springboot.starter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther wang.zhc
 * @Date 2020/1/16 10:12
 * @Description
 */
@Configuration
public class MyStarterConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
