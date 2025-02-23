package com.spring.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    public BaseballCoach() {
        System.out.println("In constructor of BaseballCoach" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Let practice baseball coach everyday";
    }
}
