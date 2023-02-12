package com.example.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.eventmodel.Event;
import com.example.university.service.EventService;

@RestController
@RequestMapping("/api/Event")
public class EventController {
    @Autowired
    private EventService eveservice;

    @GetMapping("/Get all event")
    public List<Event> getAll(){
        return eveservice.getAll();
    }
    @GetMapping("Get event by date/date/{date1}")
    public List<Event> findbyalldate(@PathVariable String date1){
        return eveservice.findallbydate(date1);
    }
    @PostMapping("Add event")
    public void addevent(@RequestBody Event event){
        eveservice.addevent(event);
    }
    @PutMapping("update/eventById/{eventId}")
    public void updateevent(@PathVariable int eventId, @RequestBody Event event){
         eveservice.updateevent(eventId,event);
    }
    @DeleteMapping("delete event/eventid/{id}")
    public void deleteevent(@PathVariable int id){
        eveservice.deleteevent(id);
    }
   
}
