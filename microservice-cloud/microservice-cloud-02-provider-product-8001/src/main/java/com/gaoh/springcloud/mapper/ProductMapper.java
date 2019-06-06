package com.gaoh.springcloud.mapper;

import com.gaoh.entity.Product;

import java.util.List;

/**
 * @Author: GH
 * @Date: 2019/5/29 21:28
 * @Version 1.0
 */
public interface ProductMapper {
    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
