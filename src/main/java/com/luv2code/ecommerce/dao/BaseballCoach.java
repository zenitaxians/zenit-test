package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.dao.Coach;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class BaseballCoach implements Coach {

//    public BaseballCoach(){
//        System.out.println("In constructor: " + getClass().getSimpleName());
//    }
    @Override
    public String getDailyWorkout() {
        return "HELLO BASEBALL!";
    }
}
