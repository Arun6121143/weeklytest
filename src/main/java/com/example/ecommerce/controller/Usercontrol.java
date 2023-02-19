package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// import com.example.ecommerce.dao.UserRepo;
import com.example.ecommerce.model.User;
import com.example.ecommerce.service.Userservice;

@RestController
public class Usercontrol {
    @Autowired
     Userservice userservice;
    @PostMapping("/createuser")
    public void createUser(@RequestBody User user){
        userservice.createUser(user);

    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userservice.getAllUser();
    }

    @GetMapping("/userid/{id}")
    public User getUserById(@PathVariable Integer id){
        return userservice.getUserById(id);
    }

}
