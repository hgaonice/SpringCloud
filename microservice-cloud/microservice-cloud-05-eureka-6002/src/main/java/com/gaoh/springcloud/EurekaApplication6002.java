package com.gaoh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: GH
 * @Date: 2019/5/30 12:53
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication6002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication6002.class,args);

    }
}
