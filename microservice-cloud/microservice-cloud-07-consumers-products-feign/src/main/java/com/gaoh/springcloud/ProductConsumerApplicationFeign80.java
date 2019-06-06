package com.gaoh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: GH
 * @Date: 2019/5/29 22:00
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.gaoh.springcloud"})
public class ProductConsumerApplicationFeign80 {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumerApplicationFeign80.class,args);
    }
}
