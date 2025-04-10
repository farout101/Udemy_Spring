package net.farout.firstspringboot.service;

import net.farout.firstspringboot.model.Student;
import net.farout.firstspringboot.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentService() {
        System.out.println("StudentService constructor called");
    }

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student student) {
       repo.save(student);
    }

    public List<Student> getAllStudents() {
        return repo.getAllStudents();
    }
}
