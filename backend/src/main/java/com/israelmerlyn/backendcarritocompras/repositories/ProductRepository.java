package com.israelmerlyn.backendcarritocompras.repositories;

import com.israelmerlyn.backendcarritocompras.model.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
