package com.learning.springboot.starter.service;

import com.learning.springboot.starter.config.MyStarterProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther wang.zhc
 * @Date 2020/1/16 10:15
 * @Description
 */
public class MyService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RestTemplate restTemplate;

    private String prop1;
    private String prop2;
    private String prop3;


    public MyService(MyStarterProperties myStarterProperties) {
        this.prop1 = myStarterProperties.getProp1();
        this.prop2 = myStarterProperties.getProp2();
        this.prop3 = myStarterProperties.getProp3();
    }

    public void print(){
        logger.info(prop1);
        logger.info(prop2);
        logger.info(prop3);
    }
}

