package com.example.deploy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.deploy.dao.DeployRepository;
import com.example.deploy.model.Deploy;
@Service
public class DeployService {
     @Autowired
     DeployRepository repository;
    public void saveSongs(Deploy song) {
           repository.save(song);
    }
public List<Deploy> getall() {
       return repository.findAll();
}
    
}
