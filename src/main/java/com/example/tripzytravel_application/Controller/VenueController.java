package com.example.tripzytravel_application.Controller;

// import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;

// import com.example.tripzytravel_application.Entities.Venue;
// import com.example.tripzytravel_application.Entities.Venue;
import com.example.tripzytravel_application.Service.VenueService;

// import jakarta.validation.Valid;

public class VenueController {
    @Autowired
    private VenueService venueService;
    //  @GetMapping("/venues/{id}")
    // public Venue getVenue(@PathVariable Integer id) {
    //     return venueService.getVenueWithActivity(id);
    // }

    // public Collection<Venue>getVenues() {
    //     return this.venueService.getAllVenues();
    // }

    // @GetMapping("/venues/{id}")
    // public Venue getVenueById(@PathVariable Integer id){
    //     return this.venueService.getVenueById(id);
    // }

    // //For adding 
    // @PostMapping("/venues")
    // public Venue addVenue(@RequestBody @Valid Venue venue){
    //     return this.venueService.addVenue(venue);
    // }

    // //For deleting
    // @DeleteMapping("/venues/{id}")
    // public String deleteVenue(@PathVariable Integer id){
    //     return this.venueService.deleteVenue(id);
    // }

    // //For updating
    // @PutMapping("venues/{id}")
    // public String updateVenue(@PathVariable Integer id,@RequestBody Venue venue){
    //     return this.venueService.updateVenue(id, venue);
    // }
}
