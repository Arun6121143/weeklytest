package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.dao.UserRepo;
import com.example.ecommerce.model.User;
@Service
public class Userservice {
    @Autowired
     UserRepo userrepo;
    public void createUser(User u) {
         userrepo.save(u);
    }

    public List<User> getAllUser() {
        return userrepo.findAll();
    }

    public User getUserById(Integer id){
        return userrepo.findById(id).get();
    }
    
}
