package com.spring.annotationdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{
    public void setMail(String mail) {
        this.mail = mail;
    }

    //initialize value using @Value annotation
    @Value("Pramila@gmial.com")
    private String mail;
    @Value("Silly coder")
    private String team;

    public SwimCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "name : "+team+" mail: "+mail;
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
