package com.gaoh.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Author: GH
 * @Date: 2019/5/29 21:38
 * @Version 1.0
 */
@EnableHystrix
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.gaoh.springcloud.mapper")
public class ProductProviderApplicationhytrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProviderApplicationhytrix8001.class,args);
    }
}
