package com.gaoh.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: GH
 * @Date: 2019/5/29 21:55
 * @Version 1.0
 */
@Configuration
public class ConfigBean {

    /**
     *  @LoadBalanced 负载均衡
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
