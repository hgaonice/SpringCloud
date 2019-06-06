package com.gaoh.springcloud.service;

import com.gaoh.entity.Product;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: GH
 * @Date: 2019/5/29 21:32
 * @Version 1.0
 */
@Component
public interface ProductService {
    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
