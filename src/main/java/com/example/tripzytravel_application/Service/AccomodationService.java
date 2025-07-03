package com.example.tripzytravel_application.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.example.tripzytravel_application.Entities.Accomodation;

@Service
public class AccomodationService {
    private Map<Integer,Accomodation>accomodationMap=new HashMap<>();
    private AtomicInteger atomic=new AtomicInteger();
    public AccomodationService(){
        Accomodation acc=new Accomodation();
        acc.setId(atomic.incrementAndGet());
        acc.setAccomodationname("Ritz");
        acc.setAccomodationtype("HotelRooms");
        acc.setAddress("Spain");
        acc.setAmenities("Roomservice,Parking");
        acc.setRoomtype("Singleroom");
        acc.setPricepernight(300);
        acc.setTotalstayprice(1500);
        acc.setAvailability("Available");
        accomodationMap.put(acc.getId(), acc);
    }

    //For getting all accomodation
    public Collection<Accomodation>getAllAccomodations(){
        return accomodationMap.values();
    }
    //For getting accomodation by id
    public Accomodation getAccomodationById(Integer id){
        return accomodationMap.get(id);
    }
    //For adding accomodation through postman
    public Accomodation addAccomodation(Accomodation accomodation){
        accomodation.setId(atomic.incrementAndGet());
        accomodationMap.put(accomodation.getId(), accomodation);
        return accomodation;
    }
    //For deleting accomodation through postman
    public String deleteAccomodation(Integer id){
        Accomodation accomodationexists=accomodationMap.get(id);
        if(accomodationexists!=null){
            accomodationMap.remove(id);
            return "Accomodation deleted successfully";
        }else{
            return "no such accomodation found ...";
        }
    }
    //For updating accomodation through postman
    public String updateAccomodation(Integer id,Accomodation accomodation){
        Accomodation accomodationexists=accomodationMap.get(id);
        if(accomodationexists!=null){
            accomodation.setId(id);
            accomodationMap.put(id, accomodation);
            return "Accomodation updated succesfully";
        }else{
            return " no such accomodation found ...";
        }
    }
}
