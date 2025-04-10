package net.farout.firstspringboot.repository;

import net.farout.firstspringboot.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepo {

    public StudentRepo() {
        System.out.println("StudentRepo constructor called");
    }

    public void save(Object student) {
        System.out.println("Student saved: " + student);
    }

    public List<Student> getAllStudents() {
        System.out.println("Fetching all students");
        return List.of(new Student());
    }
}
