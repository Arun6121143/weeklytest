package com.example.deploy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.deploy.model.Deploy;

public interface DeployRepository extends JpaRepository<Deploy,Integer> {
    
}
