package com.soneray.productservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.soneray.productservice.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
