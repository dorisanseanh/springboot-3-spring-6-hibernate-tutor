package com.spring.setter.injection;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice cricket workout :>>";
    }
}
