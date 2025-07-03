package com.example.tripzytravel_application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tripzytravel_application.Entities.Customers;

public interface CustomersRepository extends JpaRepository<Customers,Integer> {
    
}
