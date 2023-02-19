package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.dao.Productrepo;
import com.example.ecommerce.model.Product;

@Service
public class Productservice {
    
    @Autowired
     Productrepo prorepo;
    public void createPro(Product pro) {
         prorepo.save(pro);
    }
    public List<Product> getAllProduct() {
        return prorepo.findAll();
    }
    public Product getProductById(Integer id) {
        return prorepo.findById(id).get();
    }
    public void deleteProduct(Integer id) {
        prorepo.deleteById(id);
    }
}
