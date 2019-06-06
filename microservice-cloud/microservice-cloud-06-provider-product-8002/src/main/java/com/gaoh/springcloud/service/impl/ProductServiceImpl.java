package com.gaoh.springcloud.service.impl;

import com.gaoh.entity.Product;
import com.gaoh.springcloud.mapper.ProductMapper;
import com.gaoh.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: GH
 * @Date: 2019/5/29 21:33
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product findById(Long pid) {
        return productMapper.findById(pid);
    }

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public boolean addProduct(Product product) {
        return productMapper.addProduct(product);
    }
}
