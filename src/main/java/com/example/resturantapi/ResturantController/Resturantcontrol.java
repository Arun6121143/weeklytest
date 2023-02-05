package com.example.resturantapi.ResturantController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resturantapi.ResturantModel.Resturant;
import com.example.resturantapi.Resturantservice.ResturantService;

@RestController

public class Resturantcontrol {
@Autowired
 private ResturantService resturantservice;
  
 @RequestMapping("/resturants")
  public List<Resturant> getAllresturants(){
    return resturantservice.getAllResturant();
  }

 @PostMapping("/resturants")
 public void addResturant(@RequestBody Resturant resturant){
    resturantservice.addResturant(resturant);
 }
 @GetMapping("/resturants/rname/{Rname}")
  public Resturant gResturant(@PathVariable String Rname){
    return resturantservice.getResturant(Rname);
  }
 

    
}
