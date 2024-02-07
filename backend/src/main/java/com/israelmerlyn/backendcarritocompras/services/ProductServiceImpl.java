package com.israelmerlyn.backendcarritocompras.services;

import com.israelmerlyn.backendcarritocompras.model.entities.Product;
import com.israelmerlyn.backendcarritocompras.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements  ProductServices{

    //inyectamos el repository
    @Autowired
   private ProductRepository repository;
    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }
}
