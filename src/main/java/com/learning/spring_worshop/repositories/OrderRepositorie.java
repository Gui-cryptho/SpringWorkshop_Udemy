package com.learning.spring_worshop.repositories;

import com.learning.spring_worshop.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositorie extends JpaRepository<Order, Long> {
}
