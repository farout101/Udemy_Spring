package net.farout.firstspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FirstSpringAppApplication.class, args);
        Alien alien = context.getBean(Alien.class);
        alien.code();
    }

}
