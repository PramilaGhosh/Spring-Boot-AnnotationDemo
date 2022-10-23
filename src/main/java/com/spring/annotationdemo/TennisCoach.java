package com.spring.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.swing.*;


//if we not specify bean id then it automatically takes className as a bean id but first letter is small letter in the class in bean
@Component
//by default component scope is singleTone scope  means objects holds same memory location
@Scope("prototype")
public class TennisCoach implements Coach {
    //field injection
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;


    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    //inject method
    @Autowired
    public void doSomeCrazyStuff(){
        System.out.println("TennisCoach: inside doSomeCrazyStuff() method");
    }

    //this constructor is use for creating object by spring bean
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
