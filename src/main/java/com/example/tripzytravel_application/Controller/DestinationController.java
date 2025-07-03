package com.example.tripzytravel_application.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.tripzytravel_application.Entities.Destination;
import com.example.tripzytravel_application.Service.DestinationService;

@RestController
public class DestinationController {
     @Autowired
    private DestinationService destinationService;

    //Searching
    @GetMapping("/destinations/searchbycustomername")
    public ResponseEntity<?>findBycustomername(@RequestParam String Customername){
        List<Destination>destinations=this.destinationService.findBycustomername(Customername);
        if(destinations.isEmpty()){
            return new ResponseEntity<>("no destination exists with Customername",HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<>(this.destinationService.findBycustomername(Customername),HttpStatus.OK);
        }
    }

    @GetMapping("/destinations/searchbycountry")
    public ResponseEntity<?>findBycountry(@RequestParam String Country){
        List<Destination>destinations=this.destinationService.findBycountry(Country);
        if(destinations.isEmpty()){
            return new ResponseEntity<>("no destination exists with country",HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<>(this.destinationService.findBycountry(Country),HttpStatus.OK);
        }
    }

    //Sorting 
    @GetMapping("/destinations/searchbypriceperday")
    public ResponseEntity<?>getbypriceperday(Integer value){
        List<Destination>destinations=this.destinationService.getBypriceperdayLessThan(value);
        if(destinations.isEmpty()){
            return new ResponseEntity<>("no destination exists with priceperday",HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<>(destinations,HttpStatus.OK);
        }
    }
}
