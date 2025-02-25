package com.spring.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());

    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In do my clean up stuff: " + getClass().getSimpleName());
    }

    //    define our init method
    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println("In init: " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice cricket workout";
    }
}
