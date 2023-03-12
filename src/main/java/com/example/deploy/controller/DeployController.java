package com.example.deploy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.deploy.model.Deploy;
import com.example.deploy.service.DeployService;

@RestController
public class DeployController {
     @Autowired
     DeployService service;

    @PostMapping("/Songs")
    public String postSongs(@RequestBody Deploy song){
        service.saveSongs(song);
        return"Songs details Saved";
    }

    @GetMapping("/getsongs")
    public List<Deploy> getallsongs(){
        return service.getall();
    }
}
