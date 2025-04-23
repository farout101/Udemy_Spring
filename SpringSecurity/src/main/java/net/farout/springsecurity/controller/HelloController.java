package net.farout.springsecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("")
    public String hello(HttpServletRequest request) {
        return "Sessoion ID - " + request.getSession().getId();
    }

    @GetMapping("/about")
    public String about(HttpServletRequest request) {
        return "About page, Session ID - " + request.getSession().getId();
    }
}
