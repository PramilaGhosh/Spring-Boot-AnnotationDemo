package com.spring.annotationdemo;

import org.springframework.stereotype.Component;


//if we not specify bean id then it automatically takes className as a bean id but first letter is small letter in the class in bean
@Component("thatSillyCoach")
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice your backed volley";
    }
}
