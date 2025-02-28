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
            multipleStudent(studentDAO);
//
        };
    }

    private void multipleStudent(StudentDAO studentDAO) {
//        create the student object
        System.out.println("Creating student");
        Student student1 = new Student("Botina", "Nguyen", "jadonnguyenh@gmail.com");
        Student student2 = new Student("Ashlenguci", "Nguyen", "ashleynguyen@gmail.com");
        Student student3 = new Student("Hanna", "Bui", "anna@gmail.com");
//        save the student
        System.out.println("Saving student: ");
        studentDAO.save(student1);
        studentDAO.save(student2);
        studentDAO.save(student3);
//        display id of the saved student
        System.out.println("Saved student: " + student1.getFirstName());
        System.out.println("Saved student: " + student2.getFirstName());
        System.out.println("Saved student: " + student3.getFirstName());
    }

//    private void createStudent(StudentDAO studentDAO) {
////        create the student object
//        System.out.println("Creating student");
//        Student student = new Student("Dorisanse", "Bui", "dorisanseanh@gmail.com");
////        save the student
//        System.out.println("Saving student: ");
//        studentDAO.save(student);
////        display id of the saved student
//        System.out.println("Saved student: " + student.getFirstName());
//
//    }
}
