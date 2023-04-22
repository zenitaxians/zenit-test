package com.luv2code.ecommerce.controller;

import com.luv2code.ecommerce.dao.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
//    @Autowired
//    public DemoController(@Qualifier("swimCoach") Coach theCoach){
//        myCoach = theCoach;
//        System.out.println("In constructor: " + getClass().getSimpleName());
//    }

    @GetMapping("/dailyworkout")//test
    public String getDailyWorkout(){
        //test1
        //test2
        //test3
        return myCoach.getDailyWorkout();
    }

}
