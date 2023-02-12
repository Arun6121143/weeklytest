package com.example.university.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.university.eventmodel.Event;
// import com.example.university.studentmodel.Student;

@Service
public class EventService {
    private static List<Event> events = new ArrayList<>();

static {
     events.add(new Event(01,"FreshersDay","mumbai","22-2-23","10.30 Am", "1.00 pm"));
     events.add(new Event(02,"EthnicDay","mumbai","22-2-23","10.30 Am", "1.00 pm"));
     events.add(new Event(03,"SportsDay","mumbai","24-2-23","10.30 Am", "1.00 pm"));
     events.add(new Event(04,"DanceCompetation","mumbai","25-2-23","10.30 Am", "1.00 pm"));
     

}

public List<Event> getAll() {
    return events;
}

public List<Event> findallbydate(String date1){
    // return events.stream().filter(t-> t.getDate().equals(date1)).findFirst().get();
    List<Event> e1 = new ArrayList<>();
    for(Event i:events){
        if(i.getDate().equals(date1)){
            e1.add(i);
        }
    }
    return e1;

    }
public Event findbyid(int eventId){
    return events.stream().filter(t-> t.getEventid()==eventId).findFirst().get();
   

}
public void addevent(Event event) {
    events.add(event);
}
 
public void updateevent(int eventid, Event event) {

   Event e = findbyid(eventid);
 
   e.setDate(event.getDate());
   e.setEndTime(event.getEndTime());
   e.setEventName(event.getEventName());
   e.setLocationOfEvent(event.getLocationOfEvent());
   e.setStartTime(event.getStartTime());
}
public void deleteevent(int id){
    Event e = findbyid(id);
    events.remove(e);
}

}
