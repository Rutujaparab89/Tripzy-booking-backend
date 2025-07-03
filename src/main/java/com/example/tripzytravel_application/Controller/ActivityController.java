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

// import com.example.tripzytravel_application.Entities.Activity;
import com.example.tripzytravel_application.Service.ActivityService;

// import jakarta.validation.Valid;
@RestController
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    // public Collection<Activity>getActivity() {
    //     return this.activityService.getAllActivitys();
    // }

    // @GetMapping("/activity/{id}")
    // public Activity getActivityById(@PathVariable Integer id){
    //     return this.activityService.getActivityById(id);
    // }

    // //For adding 
    // @PostMapping("/activity")
    // public Activity addActivity(@RequestBody @Valid Activity activity){
    //     return this.activityService.addActivity(activity);
    // }


    // //For deleting
    // @DeleteMapping("/activity/{id}")
    // public String deleteActivity(@PathVariable Integer id){
    //     return this.activityService.deleteActivity(id);
    // }

    // //For updating
    // @PutMapping("activity/{id}")
    // public String updateActivity(@PathVariable Integer id,@RequestBody Activity activity){
    //     return this.activityService.updateActivity(id, activity);
    // }
}
