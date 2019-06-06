package com.gaoh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: GH
 * @Date: 2019/5/29 22:00
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ProductConsumerApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumerApplication80.class,args);
    }
}
