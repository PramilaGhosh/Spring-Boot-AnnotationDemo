package com.spring.annotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigurationDemoApp {
    public static void main(String[] args) {
        //read spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);

        //get the bean from spring container
        Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach theSwimCoach = context.getBean("swimCoach", Coach.class);

        //call a method on the bean
        System.out.println(theTennisCoach.getDailyWorkout());
        System.out.println(theSwimCoach.getDailyWorkout());

        //call method to get the daily fortune
        System.out.println(theTennisCoach.getDailyFortune());
        System.out.println(theSwimCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
