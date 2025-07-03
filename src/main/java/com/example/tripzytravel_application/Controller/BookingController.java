package com.example.tripzytravel_application.Controller;

// import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// import com.example.tripzytravel_application.Entities.Booking;
import com.example.tripzytravel_application.Service.BookingService;

// import jakarta.validation.Valid;

@RestController
public class BookingController {
    @Autowired
    private BookingService bookingService;

    // public Collection<Booking>getBookings() {
    //     return this.bookingService.getAllBookings();
    // }

    // @GetMapping("/bookings/{id}")
    // public Booking getBookingById(@PathVariable Integer id){
    //     return this.bookingService.getBookingById(id);
    // }

    // //For adding 
    // @PostMapping("/bookings")
    // public Booking addBooking(@RequestBody @Valid Booking booking){
    //     return this.bookingService.addBooking(booking);
    // }


    // //For deleting
    // @DeleteMapping("/bookings/{id}")
    // public String deleteBooking(@PathVariable Integer id){
    //     return this.bookingService.deleteBooking(id);
    // }

    // //For updating
    // @PutMapping("bookings/{id}")
    // public String updateBooking(@PathVariable Integer id,@RequestBody Booking booking){
    //     return this.bookingService.updateBooking(id, booking);
    // }
}
