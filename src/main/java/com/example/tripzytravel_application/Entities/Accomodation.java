package com.example.tripzytravel_application.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Accomodation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String accomodationname;
    private String accomodationtype;
    private String address;
    private String Amenities;
    private String roomtype;
    private double pricepernight;
    private double totalstayprice;
    private String Availability;

    @ManyToMany(mappedBy = "accomodations")
     private List<Booking>bookings;
}
