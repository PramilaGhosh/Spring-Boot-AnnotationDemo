package com.spring.annotationdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    //create an array of string
    private String[] data={
            "Diligence is the mother of good luck",
            "Time and tide wait for none",
            "Utilise your time"

    };

    //create a random number generator
    private Random randomNumber=new Random();

    @Override
    public String getFortune() {
        int index=randomNumber.nextInt(data.length);
        return data[index];
    }
}
