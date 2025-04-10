package net.farout.firstspringboot.repository;

import net.farout.firstspringboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public StudentRepo() {
        System.out.println("StudentRepo constructor called");
    }

    public void save(Student s) {

        String sql = "INSERT INTO student (rollno, name, marks) VALUES (?, ?, ?)";

        int rows = jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println("Rows inserted: " + rows);
    }

    public List<Student> getAllStudents() {
        System.out.println("Fetching all students");
        return List.of(new Student());
    }
}
