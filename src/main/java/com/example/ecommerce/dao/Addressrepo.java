package com.example.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import com.example.ecommerce.model.Address;
// @Repository
public interface Addressrepo extends JpaRepository<Address,Integer> {
    
}
