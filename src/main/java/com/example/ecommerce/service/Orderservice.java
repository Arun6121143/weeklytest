package com.example.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.dao.Orderrepo;
import com.example.ecommerce.model.Orders;
@Service
public class Orderservice {
    @Autowired
     Orderrepo orderrepo;
    public Orders createOrder(Orders o) {
        return orderrepo.save(o);
    }
    public Orders getOrderById(Integer id) {
        return orderrepo.findById(id).get();
    }
    
}
