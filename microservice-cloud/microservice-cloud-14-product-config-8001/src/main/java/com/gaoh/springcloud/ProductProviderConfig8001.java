package com.gaoh.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: GH
 * @Date: 2019/6/5 12:53
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.gaoh.springcloud.mapper")
public class ProductProviderConfig8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProviderConfig8001.class, args);
    }
}
