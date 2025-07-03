package com.example.tripzytravel_application.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tripzytravel_application.Entities.Venue;
public interface VenueRepository extends JpaRepository<Venue,Integer>{

    
}
