package com.gaoh.springcloud.controller;

import com.gaoh.entity.Product;
import com.gaoh.springcloud.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: GH
 * @Date: 2019/5/29 21:35
 * @Version 1.0
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    /**
     * 熔断器
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "getFallback")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        Product product = productService.findById(id);
        if (product == null) {
            throw new RuntimeException("无效的ID[" + id + "]");
        }
        return product;
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.findAll();
    }


    public Product getFallback(@PathVariable("id") Long id) {
        return new Product(id,
                "ID=" + id + "无效--@HystrixCommand",
                "无有效数据库");
    }
}
