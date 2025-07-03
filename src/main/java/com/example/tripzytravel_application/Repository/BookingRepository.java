package com.example.tripzytravel_application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tripzytravel_application.Entities.Booking;

public interface BookingRepository extends JpaRepository<Booking,Integer> {
    
}
