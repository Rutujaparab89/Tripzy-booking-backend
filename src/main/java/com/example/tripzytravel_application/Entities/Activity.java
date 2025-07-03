package com.example.tripzytravel_application.Entities;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String activityname;
    private String activitytype;
    private String starttime;
    private String endtime;
    private String duration;
    private String location;
    private double fee;
    private String status;
    private String reviews;
    private String protocols;

    // @OneToMany(mappedBy = "activity")
    // private List<Venue>venue;
}
