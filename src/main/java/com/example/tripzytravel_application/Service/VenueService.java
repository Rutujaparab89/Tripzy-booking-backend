package com.example.tripzytravel_application.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.example.tripzytravel_application.Entities.Venue;
import com.example.tripzytravel_application.Repository.VenueRepository;

import com.example.tripzytravel_application.Entities.Venue;

@Service
public class VenueService {
    
    private Map<Integer,Venue>venueMap=new HashMap<>();
    private AtomicInteger atomic=new AtomicInteger();
    public VenueService(){
        Venue v=new Venue();
        v.setId(atomic.incrementAndGet());
        v.setVenuename("WiZink Center");
        v.setVenuetype("Concert,sportevents");
        v.setLocation("Spain/Madrid");
        v.setOpeninghours("9:00");
        v.setCapacity(250);
        v.setVenuerestrictions("No food from outside");
        v.setTicketprice(1000);
        venueMap.put(v.getId(), v);
    }

    //For getting all venue
    public Collection<Venue>getAllVenues(){
        return venueMap.values();
    }
    //For getting venue by id
    public Venue getVenueById(Integer id){
        return venueMap.get(id);
    }
    //For adding venue through postman
    public Venue addVenue(Venue venue){
        venue.setId(atomic.incrementAndGet());
        venueMap.put(venue.getId(), venue);
        return venue;
    }
    //For deleting venue through postman
    public String deleteVenue(Integer id){
        Venue venueexists=venueMap.get(id);
        if(venueexists!=null){
            venueMap.remove(id);
            return "Venue deleted successfully";
        }else{
            return "no such venue found ...";
        }
    }
    //For updating venue through postman
    public String updateVenue(Integer id,Venue venue){
        Venue venueexists=venueMap.get(id);
        if(venueexists!=null){
            venue.setId(id);
            venueMap.put(id, venue);
            return "Venue updated succesfully";
        }else{
            return " no such venue found ...";
        }
    }
}
