package com.spring.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println("In constructor" + getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return "Let practice your backhand volley";
    }
}
