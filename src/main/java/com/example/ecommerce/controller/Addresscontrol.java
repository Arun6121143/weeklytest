package com.example.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.Address;
import com.example.ecommerce.service.Addressservice;

@RestController
public class Addresscontrol {
    @Autowired
     Addressservice addressservice;
    @PostMapping("/createaddress")
    public void createAddress(@RequestBody Address addres){
        addressservice.createAddress(addres);

    }
}
