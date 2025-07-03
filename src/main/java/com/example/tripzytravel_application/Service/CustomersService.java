package com.example.tripzytravel_application.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.example.tripzytravel_application.Entities.Customers;

@Service
public class CustomersService {
    private Map<Integer,Customers>customers=new HashMap<>();
    private AtomicInteger atomic=new AtomicInteger();
    public CustomersService(){
        Customers c=new Customers();
        c.setId(atomic.incrementAndGet());
        c.setFirstname("Rutuja");
        c.setLastname("Parab");
        c.setPhonenumber("7045923452");
        c.setAge(22);
        c.setBirthdate("2002-04-26");
        c.setEmail("rutuja26@gmail.com");
        c.setPassword("rutu8995");
        customers.put(c.getId(), c);
    }

    //For getting all customers
    public Collection<Customers>getAllCustomers(){
        return customers.values();
    }
    //For getting customers by id
    public Customers getCustomerById(Integer id){
        return customers.get(id);
    }
    //For adding customers through postman
    public Customers addCustomer(Customers customer){
        customer.setId(atomic.incrementAndGet());
        customers.put(customer.getId(), customer);
        return customer;
    }
    //For deleting customers through postman
    public String deleteCustomer(Integer id){
        Customers customerexists=customers.get(id);
        if(customerexists!=null){
            customers.remove(id);
            return "customer deleted successfully";
        }else{
            return "no such customer..";
        }
    }
    //For updating customers through postman
    public String updateCustomer(Integer id,Customers customer){
        Customers customerexists=customers.get(id);
        if(customerexists!=null){
            customer.setId(id);
            customers.put(id, customer);
            return "customer updated succesfully";
        }else{
            return " no such customer";
        }
    }
}
