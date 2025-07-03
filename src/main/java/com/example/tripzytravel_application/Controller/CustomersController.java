package com.example.tripzytravel_application.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tripzytravel_application.Entities.Customers;
import com.example.tripzytravel_application.Service.CustomersService;

@RestController
public class CustomersController {
    @Autowired
    private CustomersService customerService;

    @GetMapping("/customers")
    public Collection<Customers>getCustomers() {
        return this.customerService.getAllCustomers();
    }
    
    @GetMapping("/customers/{id}")
    public Customers getCustomerById(@PathVariable Integer id){
        return this.customerService.getCustomerById(id);
    }

    //For adding 
    @PostMapping("/customers")
    public Customers addCustomer(@RequestBody Customers customer){
        return this.customerService.addCustomer(customer);
    }
    
    //For deleting
    @DeleteMapping("/customer/{id}")
    public String deleteCustomer(@PathVariable Integer id){
        return this.customerService.deleteCustomer(id);
    }

    //For updating
    @PutMapping("customers/{id}")
    public String updateCustomer(@PathVariable Integer id,@RequestBody Customers customer){
        return this.customerService.updateCustomer(id, customer);
    }

}
