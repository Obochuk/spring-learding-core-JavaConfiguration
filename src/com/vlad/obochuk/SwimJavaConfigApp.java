package com.vlad.obochuk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// DI & IoC inside Java code(using configuration file)
public class SwimJavaConfigApp {

    public static void main(String[] args) {
        //read spring config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        //call the method on the bean
        System.out.println(coach.getDailyWorkout());

        // call the method to get fortune
        System.out.println(coach.getFortune());

        //call new methods
        System.out.println("email: " + coach.getEmail());
        System.out.println("team: " + coach.getTeam());

        //close the context
        context.close();
    }

}
