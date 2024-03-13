package com.damilah.coffeeShop.coffeeShop.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TruckCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "truck";
    }
}
