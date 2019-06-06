package com.gaoh.springcloud.service;

import com.gaoh.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: GH
 * @Date: 2019/6/4 15:40
 * @Version 1.0
 */
@Component
public class ProductClientServiceFallBack implements ProductConsumerService {
    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id,
                "ID=" + id + "无效--@HystrixCommand",
                "无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
