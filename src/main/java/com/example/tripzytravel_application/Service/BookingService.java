package com.example.tripzytravel_application.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;
import com.example.tripzytravel_application.Entities.Booking;

@Service
public class BookingService {
    private Map<Integer,Booking>bookingMap=new HashMap<>();
    private AtomicInteger atomic=new AtomicInteger();
    public BookingService(){
        Booking b=new Booking();
        b.setId(atomic.incrementAndGet());
        b.setName("Sofia");
        b.setAge(23);
        b.setTotalpersons(1);
        b.setPhoneno("7045923452");
        b.setBookingdate("2025-02-05");
        b.setCheckindate("2025-02-15");
        b.setCheckoutdate("2025-02-22");
        b.setTotalprice(35830);
        b.setBookingstatus("completed");
        b.setPaymentmethod("CreditCard");
        bookingMap.put(b.getId(), b);
    }

    //For getting all booking
    public Collection<Booking>getAllBookings(){
        return bookingMap.values();
    }
    //For getting booking by id
    public Booking getBookingById(Integer id){
        return bookingMap.get(id);
    }
    //For adding booking through postman
    public Booking addBooking(Booking booking){
        booking.setId(atomic.incrementAndGet());
        bookingMap.put(booking.getId(), booking);
        return booking;
    }
    //For deleting booking through postman
    public String deleteBooking(Integer id){
        Booking bookingsexists=bookingMap.get(id);
        if(bookingsexists!=null){
            bookingMap.remove(id);
            return "Booking deleted successfully";
        }else{
            return "no such booking found ...";
        }
    }
    //For updating booking through postman
    public String updateBooking(Integer id,Booking booking){
        Booking bookingsexists=bookingMap.get(id);
        if(bookingsexists!=null){
            booking.setId(id);
            bookingMap.put(id, booking);
            return "Booking updated succesfully";
        }else{
            return " no such booking found ...";
        }
    }
}

