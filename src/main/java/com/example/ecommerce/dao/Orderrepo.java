package com.example.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import com.example.ecommerce.model.Orders;
// @Repository
public interface Orderrepo extends JpaRepository<Orders,Integer>{
    
}
