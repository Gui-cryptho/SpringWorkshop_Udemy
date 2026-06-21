package com.learning.spring_worshop.repositories;

import com.learning.spring_worshop.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositorie extends JpaRepository<Category, Long> {
}
