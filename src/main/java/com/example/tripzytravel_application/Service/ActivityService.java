package com.example.tripzytravel_application.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.example.tripzytravel_application.Entities.Activity;

@Service
public class ActivityService {
    private Map<Integer,Activity>activityMap=new HashMap<>();
    private AtomicInteger atomic=new AtomicInteger();
    public ActivityService(){
        Activity act=new Activity();
        act.setId(atomic.incrementAndGet());
        act.setActivityname("Museo del prado(Madrid)");
        act.setActivitytype("Visting historic museum");
        act.setStarttime("10:00");
        act.setEndtime("8:00");
        act.setDuration("1 hours");
        act.setLocation("Madrid");
        act.setFee(0);
        act.setStatus("Open");
        act.setReviews("History,creativity,cultural art");
        act.setProtocols("No photoshoot,food");
        activityMap.put(act.getId(), act);
    }

    //For getting all activity
    public Collection<Activity>getAllActivitys(){
        return activityMap.values();
    }
    //For getting activity by id
    public Activity getActivityById(Integer id){
        return activityMap.get(id);
    }
    //For adding activity through postman
    public Activity addActivity(Activity activity){
        activity.setId(atomic.incrementAndGet());
        activityMap.put(activity.getId(), activity);
        return activity;
    }
    //For deleting activity through postman
    public String deleteActivity(Integer id){
        Activity activityexists=activityMap.get(id);
        if(activityexists!=null){
            activityMap.remove(id);
            return "Activity deleted successfully";
        }else{
            return "no such activity found ...";
        }
    }
    //For updating activity through postman
    public String updateActivity(Integer id,Activity activity){
        Activity activityexists=activityMap.get(id);
        if(activityexists!=null){
            activity.setId(id);
            activityMap.put(id, activity);
            return "Activity updated succesfully";
        }else{
            return " no such activity found ...";
        }
    }
}
