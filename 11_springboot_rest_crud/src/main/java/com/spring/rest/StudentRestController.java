package com.spring.rest;

import com.spring.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
//    define endpoint for "students"- return a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anh", "Bui"));
        students.add(new Student("Tuan", "Bui"));
        students.add(new Student("Sang", "Bui"));
        return students;
    }
}
