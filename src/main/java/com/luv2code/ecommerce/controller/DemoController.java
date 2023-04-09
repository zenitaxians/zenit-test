package com.luv2code.ecommerce.controller;

import com.luv2code.ecommerce.dao.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach){
        myCoach = theCoach;
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
