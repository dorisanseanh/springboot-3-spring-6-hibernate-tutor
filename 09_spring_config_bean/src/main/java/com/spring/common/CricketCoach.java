package com.spring.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());

    }

    @Override
    public String getDailyWorkout() {
        return "Practice cricket workout";
    }
}
