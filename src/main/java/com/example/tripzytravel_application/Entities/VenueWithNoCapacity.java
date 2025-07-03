package com.example.tripzytravel_application.Entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="nocapacity",types = (Venue.class))
public interface VenueWithNoCapacity {
    String getVenuename();
    String getVenuetype();
    String getLocation();
    double getTicketprice();
}
