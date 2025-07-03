package com.example.tripzytravel_application.Entities;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer age;
    private Integer totalpersons;
    private String phoneno;
    private String bookingdate;
    private String checkindate;
    private String checkoutdate;
    private double totalprice;
    private String bookingstatus;
    private String paymentmethod;


    @ManyToMany
    @JoinTable(name = "booking_accomodation",
    joinColumns=@JoinColumn(name="booking_id",referencedColumnName = "id"),
    inverseJoinColumns=@JoinColumn(name="accomodation_id",referencedColumnName = "id"))
    private List<Accomodation>accomodations;
     
    
}
