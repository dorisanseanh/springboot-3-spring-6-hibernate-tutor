package com.spring.dao;

import com.spring.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save (Student student);
    Student findById(Long id);
    List<Student> findAll();
}
