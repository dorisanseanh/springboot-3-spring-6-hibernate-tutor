package com.spring;

import com.spring.dao.StudentDAO;
import com.spring.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            createStudent(studentDAO);
        };
    }

    private void createStudent(StudentDAO studentDAO) {
//        create the student object
        System.out.println("Creating student");
        Student student = new Student("Dorisanse", "Bui", "dorisanseanh@gmail.com");
//        save the student
        System.out.println("Saving student: ");
        studentDAO.save(student);
//        display id of the saved student
        System.out.println("Saved student: " + student.getFirstName());

    }
}
