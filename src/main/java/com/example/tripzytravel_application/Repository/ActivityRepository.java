package com.example.tripzytravel_application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tripzytravel_application.Entities.Activity;

public interface ActivityRepository extends JpaRepository<Activity,Integer>{
    
}
