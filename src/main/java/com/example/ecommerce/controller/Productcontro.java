package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.Productservice;

@RestController
public class Productcontro {
    @Autowired
     Productservice proservice;
    @PostMapping("/createpro")
    public void createProduct(@RequestBody Product pro){
         proservice.createPro(pro);
     }

     @GetMapping("/getAllProduct")
     public List<Product> getAllProduct(){
         return proservice.getAllProduct();
     }
 
     @GetMapping("/productid/{id}")
     public Product getProductById(@PathVariable Integer id){
         return proservice.getProductById(id);
     }
     @DeleteMapping("/delete/{id}")
     public void deleteProduct(@PathVariable Integer id){
         proservice.deleteProduct(id);
     }
}
