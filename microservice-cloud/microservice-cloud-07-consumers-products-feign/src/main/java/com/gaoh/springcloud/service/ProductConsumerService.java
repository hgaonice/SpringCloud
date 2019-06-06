package com.gaoh.springcloud.service;

import com.gaoh.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author: GH
 * @Date: 2019/6/3 12:44
 * @Version 1.0
 */
@FeignClient(value = "MICROSERVICE-PRODUCT",fallback = ProductClientServiceFallBack.class)
@RequestMapping("/product")
public interface ProductConsumerService {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    boolean add(Product product);

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Product get(@PathVariable("id") Long id);

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Product> list();
}
