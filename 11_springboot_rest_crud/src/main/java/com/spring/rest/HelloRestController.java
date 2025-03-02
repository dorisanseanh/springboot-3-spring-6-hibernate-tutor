package com.spring.rest;

import com.spring.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class HelloRestController {
//    define endpoint for "students"- return a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {
//        check studentid again list size
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anh", "Bui"));
        students.add(new Student("Tuan", "Bui"));
        students.add(new Student("Sang", "Bui"));
        return students;
    }
}
