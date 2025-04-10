package net.farout;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public Laptop() {
        System.out.println("Laptop constructor");
    }
    public void compile() {
        System.out.println("Laptop compile");
    }
}
