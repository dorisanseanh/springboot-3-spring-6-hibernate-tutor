package com.spring.rest;

import com.spring.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> students;

    @PostConstruct
    public void init() {
        students = new ArrayList<Student>();
        students.add(new Student("Anh", "Bui"));
        students.add(new Student("Tuan", "Bui"));
        students.add(new Student("Sang", "Bui"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student students(@PathVariable int studentId) {
//        check studentId again list size
        if (studentId >= students.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id " + studentId + " not found");
        }
        return students.get(studentId);
    }

}