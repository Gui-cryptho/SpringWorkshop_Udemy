package com.learning.spring_worshop.resources;

import com.learning.spring_worshop.entities.Product;
import com.learning.spring_worshop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> obj = productService.findAll();

        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/{id}")
    public Product findById(@PathVariable Long id){
        Product obj = productService.findById(id);
        return obj;
    }
}
