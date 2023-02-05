package com.example.resturantapi.Resturantservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.resturantapi.ResturantModel.Resturant;

@Service
public class ResturantService {
    private List<Resturant> resturants = new ArrayList<>(Arrays.asList(new Resturant("Hotelchoice","Rajkot","12","soup","20","5"),
    new Resturant("HotelNarmada","Veraval","3","Chole","10","2"),
    new Resturant("HotelNamaste","Gir","5","pavbhaji","25","4")
    
    
    ));

    public List<Resturant> getAllResturant(){
        return resturants;
    }

    public Resturant getResturant(String Rname){
        return resturants.stream().filter(t -> t.getRname().equals(Rname)).findFirst().get();
    }

    public void addResturant(Resturant resturant){
        resturants.add(resturant);
    }
    
}
