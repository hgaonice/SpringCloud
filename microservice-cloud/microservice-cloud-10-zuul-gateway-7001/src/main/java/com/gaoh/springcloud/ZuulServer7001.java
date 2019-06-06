package com.gaoh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: GH
 * @Date: 2019/6/4 17:35
 * @Version 1.0
 * EnableZuulProxy 开启zuul功能
 */
@EnableZuulProxy
@SpringBootApplication
public class ZuulServer7001 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServer7001.class, args);
    }
}
