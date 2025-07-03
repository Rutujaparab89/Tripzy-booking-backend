package com.example.tripzytravel_application.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.example.tripzytravel_application.Entities.Agency1;



@Service
public class AgencyService {
     private Map<Integer,Agency1>agencies=new HashMap<>();
    private AtomicInteger atomic=new AtomicInteger();
    public AgencyService(){
        Agency1 a=new Agency1();
        a.setId(atomic.incrementAndGet());
        a.setAgencyname("Raju");
        a.setStatus("Active");
        a.setContactnumber("9960345632");
        a.setEmail("raju12@gmail.com");
        a.setBookingservice("Flight");
        a.setPaymentterm("Online");
        agencies.put(a.getId(), a);

    }
    public Collection<Agency1>getAllAgencies(){
        return agencies.values();
    }
    public Agency1 getAgencyById(Integer id){
        return agencies.get(id);
    }
    //For adding agency through postman
    public Agency1 addAgency(Agency1 agency){
        agency.setId(atomic.incrementAndGet());
        agencies.put(agency.getId(), agency);
        return agency;
    }
    //For deleting agency through postman
    public String deleteAgency(Integer id){
        Agency1 agencyexists=agencies.get(id);
        if(agencyexists!=null){
            agencies.remove(id);
            return "agency deleted successfully";
        }else{
            return "no such agency...";
        }
    }
    //For updating agency through postman
    public String updateAgency(Integer id,Agency1 agency){
        Agency1 agencyexists=agencies.get(id);
        if(agencyexists!=null){
            agency.setId(id);
            agencies.put(id, agency);
            return "agency updated succesfully";
        }else{
            return " no such agency";
        }
    }

}
