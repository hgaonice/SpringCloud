package com.gaoh.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: GH
 * @Date: 2019/6/4 18:55
 * @Version 1.0
 */
@RestController
public class ConfigClientController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    /**
     * 请求访问
     * @return
     */
    @RequestMapping("/config")
    public String getConfig() {
        String content = "applicationName:" + applicationName + ", port:" +
                port;
        System.out.println("content: " + content);
        return content;
    }
}
