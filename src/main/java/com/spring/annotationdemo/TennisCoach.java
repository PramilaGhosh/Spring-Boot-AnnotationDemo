package com.spring.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//if we not specify bean id then it automatically takes className as a bean id but first letter is small letter in the class in bean
@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TennisCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backed volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
