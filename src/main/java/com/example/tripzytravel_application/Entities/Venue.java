package com.example.tripzytravel_application.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Venue {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String venuename;
    private String venuetype;
    private String location;
    private String openinghours;
    private Integer capacity;
    private String venuerestrictions;
    private double ticketprice;

    // @ManyToOne
    // @JoinColumn(name="activity_id")
    // private Activity activity;
   

}
