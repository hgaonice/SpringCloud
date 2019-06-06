package com.gaoh.springcloud.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author: GH
 * @Date: 2019/6/6 13:16
 * @Version 1.0
 */
@Configuration
public class DruidConfig {

    /**
     * RefreshScope 刷新
     * @return
     */
    @RefreshScope
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource getDruid() {
        return new DruidDataSource();
    }
}
