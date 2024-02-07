package com.israelmerlyn.backendcarritocompras.controller;

import com.israelmerlyn.backendcarritocompras.model.entities.Product;
import com.israelmerlyn.backendcarritocompras.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductServices services;
    @GetMapping("/products")
    public List<Product> list() {

        return services.findAll();
    }

}
