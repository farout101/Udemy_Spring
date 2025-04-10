package net.farout;

import org.springframework.stereotype.Component;

@Component(value = "desktop")
public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop constructor");
    }
    public void compile() {
        System.out.println("Desktop compile");
    }
}
