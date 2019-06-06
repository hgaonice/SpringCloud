package com.gaoh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: GH
 * @Date: 2019/6/4 15:50
 * @Version 1.0
 * EnableHystrixDashboard 开启服务监控
 *
 */
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001.class, args);
    }
}
