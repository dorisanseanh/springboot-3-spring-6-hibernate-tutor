package com.spring;

import com.spring.dao.StudentDAO;
import com.spring.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            deleteAll(studentDAO);
        };
    }

    private void deleteAll(StudentDAO studentDAO) {
        System.out.println("Deleting all students");
         int studentDel = studentDAO.deleteAll();
         System.out.println("Deleted " + studentDel + " students");
    }

    private void deleteStudent(StudentDAO studentDAO) {
        int studentId = 3;
        studentDAO.delete(studentId);
        System.out.println("After deleting student: ");
        studentDAO.findAll().forEach(System.out::println);

    }

    private void updateStudent(StudentDAO studentDAO) {
//        get id student
        System.out.println("Find student id = 1: ");
        int id = 1;
        Student student = studentDAO.findById(1);
//        update student with id
        student.setFirstName("Anna");
        System.out.println("Update student :");
        studentDAO.update(student);
        System.out.println("Update student first name: " + student.getFirstName());

//        dispaly
    }

    private void queryStudentByLastName(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findByLastName("Anh");
        for (Student student : students) {
            System.out.println(student.getEmail());
        }
    }

    private void queryStudent(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void readStudent(StudentDAO studentDAO) {
        System.out.println("Creating new student ");
        Student student1 = new Student("Botina", "Nguyen", "jadonnguyenh@gmail.com");
//        save the student
        System.out.println("Saving student: ");
        studentDAO.save(student1);
//        display id of the saved student
        int theId = student1.getId();
        System.out.println("Saved student: " + theId);
//retrive student based on the id
        Student student = studentDAO.findById(theId);
        System.out.println("Reading student: " + theId);
//        display student
        System.out.println("Updating student: " + student);
    }

    private void multipleStudent(StudentDAO studentDAO) {
//        create the student object
        System.out.println("Creating student");
        Student student1 = new Student("Botina", "Nguyen", "jadonnguyenh@gmail.com");
        Student student2 = new Student("Ashlenguci", "Nguyen", "ashleynguyen@gmail.com");
        Student student3 = new Student("", "Bui", "anna@gmail.com");
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

    //     If you want change index of mysql auto increment start =3000
//    open mysql run alter table student_tracker.student auto_increment=3000;
//    if you want remove data and set auto_increment =1
//    you can run truncate student_tracker.student;
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
