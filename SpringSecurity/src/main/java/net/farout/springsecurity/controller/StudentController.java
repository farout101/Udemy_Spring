package net.farout.springsecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import net.farout.springsecurity.model.Student;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private final List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Phyo","phyo@gmail.com"),
            new Student(2,"Zaw", "zaw@gmail.com"),
            new Student(3, "Linn", "linn@gmail.com")
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    };

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    };

    @GetMapping("/csrf")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

}
