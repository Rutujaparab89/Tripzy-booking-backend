package com.example.tripzytravel_application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tripzytravel_application.Entities.Agency1;
@Repository
public interface AgencyRepository extends JpaRepository<Agency1,Integer>{
    
}
