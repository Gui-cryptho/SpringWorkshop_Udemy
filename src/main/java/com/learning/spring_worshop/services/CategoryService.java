package com.learning.spring_worshop.services;

import com.learning.spring_worshop.entities.Category;
import com.learning.spring_worshop.repositories.CategoryRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepositorie categoryRepositorie;

    public List<Category> findAll(){
        List<Category> obj = categoryRepositorie.findAll();

        return obj;
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepositorie.findById(id);
        return obj.get();
    }
}
