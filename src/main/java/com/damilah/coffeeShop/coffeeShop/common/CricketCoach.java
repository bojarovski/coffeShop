package com.damilah.coffeeShop.coffeeShop.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @PostConstruct
    public void doMyStartup(){
        System.out.println("doMyStartup");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("doMyDestroy");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
