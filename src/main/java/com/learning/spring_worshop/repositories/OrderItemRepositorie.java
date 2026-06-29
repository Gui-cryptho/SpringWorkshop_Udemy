package com.learning.spring_worshop.repositories;

import com.learning.spring_worshop.entities.OrderItem;
import com.learning.spring_worshop.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepositorie extends JpaRepository<OrderItem, Long> {
}
