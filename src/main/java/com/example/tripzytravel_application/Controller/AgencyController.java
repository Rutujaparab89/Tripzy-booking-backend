package com.example.tripzytravel_application.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tripzytravel_application.Entities.Agency1;
import com.example.tripzytravel_application.Repository.AgencyRepository;
import com.example.tripzytravel_application.Service.AgencyService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/agency1s")
public class AgencyController {
    @Autowired
    private AgencyService agencyService;

    public Collection<Agency1>getAgencies() {
        return this.agencyService.getAllAgencies();
    }

    @GetMapping("/agencies1/{id}")
    public Agency1 getAgencyById(@PathVariable Integer id){
        return this.agencyService.getAgencyById(id);
    }

    //For adding 
    @PostMapping("/agencies1")
    public Agency1 addAgency(@RequestBody @Valid Agency1 agency){
        return this.agencyService.addAgency(agency);
    }

    
    //For deleting
    @DeleteMapping("/agencies1/{id}")
    public String deleteAgency(@PathVariable Integer id){
        return this.agencyService.deleteAgency(id);
    }

    //For updating
    @PutMapping("agencies1/{id}")
    public String updateAgency(@PathVariable Integer id,@RequestBody Agency1 agency){
        return this.agencyService.updateAgency(id, agency);
    }

     @Autowired
    private AgencyRepository agencyRepository;

    @PostMapping
    public ResponseEntity<Agency1> createAgency(@Valid @RequestBody Agency1 agency1) {
        Agency1 savedAgency = agencyRepository.save(agency1);
        return new ResponseEntity<>(savedAgency, HttpStatus.CREATED);
    }
}
