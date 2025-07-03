package com.example.tripzytravel_application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tripzytravel_application.Entities.Destination;
import com.example.tripzytravel_application.Repository.DestinationRepository;

@Service
public class DestinationService {
     @Autowired
    public DestinationRepository repository;
    
    //Custom query for find by customername
    public List<Destination>findBycustomername(String Customername){
        return this.repository.findBycustomername(Customername);
    }

    //Custom query for find by country
    public List<Destination>findBycountry(String Country){
        return this.repository.findBycountry(Country);
    }
    
    //Custom query for getting data according to priceperday
     public List<Destination>getBypriceperdayLessThan(Integer value){
        return this.repository.getBypriceperdayLessThan(value);
    }
}
