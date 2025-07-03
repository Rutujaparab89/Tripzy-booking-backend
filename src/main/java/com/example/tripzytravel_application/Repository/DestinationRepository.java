package com.example.tripzytravel_application.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tripzytravel_application.Entities.Destination;

public interface DestinationRepository extends JpaRepository<Destination,Integer>{
    //Searching
    List<Destination>findBycustomername(String Customername);   
    List<Destination>findBycountry(String Country);   
    // //Sorting
    List<Destination>getBypriceperdayLessThan(Integer value); 
}
