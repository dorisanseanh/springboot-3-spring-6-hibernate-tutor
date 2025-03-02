package com.spring.rest;

import com.spring.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class DemoRestController {
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
        return students.get(studentId);
    }
}
