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

// import com.example.tripzytravel_application.Entities.Accomodation;
import com.example.tripzytravel_application.Service.AccomodationService;

// import jakarta.validation.Valid;

@RestController
public class AccomodationController {
    @Autowired
    private AccomodationService accomodationService;

    // public Collection<Accomodation>getAccomodations() {
    //     return this.accomodationService.getAllAccomodations();
    // }

    // @GetMapping("/accomodations/{id}")
    // public Accomodation getAccomodationById(@PathVariable Integer id){
    //     return this.accomodationService.getAccomodationById(id);
    // }

    // //For adding 
    // @PostMapping("/accomodations")
    // public Accomodation addAccomodation(@RequestBody @Valid Accomodation accomodation){
    //     return this.accomodationService.addAccomodation(accomodation);
    // }


    // //For deleting
    // @DeleteMapping("/accomodations/{id}")
    // public String deleteAccomodation(@PathVariable Integer id){
    //     return this.accomodationService.deleteAccomodation(id);
    // }

    // //For updating
    // @PutMapping("accomodations/{id}")
    // public String updateAccomodation(@PathVariable Integer id,@RequestBody Accomodation accomodation){
    //     return this.accomodationService.updateAccomodation(id, accomodation);
    // }
}
