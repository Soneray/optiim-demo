package com.soneray.productservice.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soneray.productservice.domain.Product;
import com.soneray.productservice.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/{id}")
    public Product get(@PathVariable long id) {
        return productRepository.findById(id).orElse(new Product(id, "VW Golf"));
    }
    
    @PostMapping
    public void create(@RequestBody Product product) {
    	productRepository.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
    	productRepository.deleteById(id);
    }

    @PutMapping
    public void update(@RequestBody Product product) {
    	productRepository.save(product);
    }


}
