package com.gaoh.springcloud.controller;

import com.gaoh.entity.Product;
import com.gaoh.springcloud.service.ProductConsumerService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: GH
 * @Date: 2019/5/29 21:58
 * @Version 1.0
 */
@RestController
@RequestMapping("/consumer/product")
public class ProductConsumerFeignController {

    @Resource
    private ProductConsumerService productConsumerService;

    @RequestMapping(value = "/add")
    public boolean add(Product product) {
        return productConsumerService.add(product);
    }

    @RequestMapping(value = "/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return productConsumerService.get(id);
    }

    @RequestMapping(value = "/list")
    public List<Product> list() {
        return productConsumerService.list();
    }
}
