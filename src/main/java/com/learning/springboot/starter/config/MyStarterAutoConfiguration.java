package com.learning.springboot.starter.config;

import com.learning.springboot.starter.service.MyService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther wang.zhc
 * @Date 2020/1/16 10:22
 * @Description
 */
@Configuration
@EnableConfigurationProperties(MyStarterProperties.class)
public class MyStarterAutoConfiguration {

    @Bean(name = "myService")
    public MyService myService(MyStarterProperties myStarterProperties){
        return new MyService(myStarterProperties);
    }

}
