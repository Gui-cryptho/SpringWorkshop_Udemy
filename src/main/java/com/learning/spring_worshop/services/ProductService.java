package com.learning.spring_worshop.services;

import com.learning.spring_worshop.entities.Product;
import com.learning.spring_worshop.repositories.ProductRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepositorie productRepositorie;

    public List<Product> findAll(){
        List<Product> obj = productRepositorie.findAll();
        return obj;
    }

    public Product findById(Long id){
        Optional<Product> obj = productRepositorie.findById(id);
        return obj.get();
    }
}
