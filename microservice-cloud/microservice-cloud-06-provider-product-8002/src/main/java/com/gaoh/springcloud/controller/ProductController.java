package com.gaoh.springcloud.controller;

import com.gaoh.entity.Product;
import com.gaoh.springcloud.service.ProductService;
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
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        return productService.findById(id);
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.findAll();
    }
}
