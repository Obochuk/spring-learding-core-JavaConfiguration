package com.vlad.obochuk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// DI & IoC in Java code first demo
public class JavaConfigDemoApp {
    public static void main(String[] args) {
        //read spring config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);

        //call the method on the bean
        System.out.println(coach.getDailyWorkout());

        //close the context
        context.close();
    }
}
