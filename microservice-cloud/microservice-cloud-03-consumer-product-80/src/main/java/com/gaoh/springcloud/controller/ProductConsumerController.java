package com.gaoh.springcloud.controller;

import com.gaoh.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: GH
 * @Date: 2019/5/29 21:58
 * @Version 1.0
 */
@RestController
@RequestMapping("/consumer/product")
public class ProductConsumerController {
//    private static final String REST_URL_PREFIX = "http://localhost:8001";

    private static final String REST_URL_PREFIX = "http://MICROSERVICE-PRODUCT";

//    private static final String REST_URL_PREFIX = "http://microservice-product";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add")
    public boolean add(Product product) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/product/add",
                product, Boolean.class);
    }

    @RequestMapping(value = "/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/get/" + id,
                Product.class);
    }

    @RequestMapping(value = "/list")
    public List<Product> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/list",
                List.class);
    }
}
