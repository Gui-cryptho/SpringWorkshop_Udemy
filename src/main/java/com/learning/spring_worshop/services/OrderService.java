package com.learning.spring_worshop.services;

import com.learning.spring_worshop.entities.Order;
import com.learning.spring_worshop.repositories.OrderRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepositorie orderRepositorie;

    public List<Order> findAll(){
        List<Order> obj = orderRepositorie.findAll();
        return obj;
    }

    public Order findById(Long id){
        Optional<Order> obj = orderRepositorie.findById(id);
        return obj.get();
    }


}
