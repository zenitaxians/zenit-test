package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.dao.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
public class BasketballCoach implements Coach {

    public BasketballCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "HELLO BASKETBALL!";
    }
}
