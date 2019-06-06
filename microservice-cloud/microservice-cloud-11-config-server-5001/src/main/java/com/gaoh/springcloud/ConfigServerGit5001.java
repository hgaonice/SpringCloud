package com.gaoh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: GH
 * @Date: 2019/6/4 18:40
 * @Version 1.0
 * EnableConfigServer 开启配置中心功能
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerGit5001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerGit5001.class, args);
    }
}
