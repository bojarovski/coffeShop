package com.damilah.coffeeShop.coffeeShop.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Baseball";
    }
}
