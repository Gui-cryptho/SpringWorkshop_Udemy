package com.learning.spring_worshop.repositories;

import com.learning.spring_worshop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositorie extends JpaRepository<Product, Long> {
}
