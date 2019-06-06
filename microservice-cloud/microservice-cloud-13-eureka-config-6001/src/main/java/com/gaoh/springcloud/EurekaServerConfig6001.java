package com.gaoh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: GH
 * @Date: 2019/6/5 12:42
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerConfig6001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerConfig6001.class, args);
    }
}
