package net.farout;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien alien = context.getBean("alien", Alien.class);
        System.out.println("Alien age: " + alien.getAge());

    }
}
