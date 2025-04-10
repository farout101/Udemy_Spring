package net.farout.firstspringboot;

import net.farout.firstspringboot.model.Student;
import net.farout.firstspringboot.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class FirstSpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);

        Student student = context.getBean(Student.class);
        student.setMarks(60);
        student.setRollNo(1);
        student.setName("John Doe");

        StudentService service = context.getBean(StudentService.class);

        service.addStudent(student);

        List<Student> studnets = service.getAllStudents();
    }

}
