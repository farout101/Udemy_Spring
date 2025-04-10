package net.farout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    int age;

    @Autowired
    @Qualifier("desktop")
    private Computer com;

    public Alien(int age) {
        System.out.println("Alien constructor with age: ");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien () {
        System.out.println("Alien constructor");
    }

    public void code() {
        System.out.println("Alien code");
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }
}
