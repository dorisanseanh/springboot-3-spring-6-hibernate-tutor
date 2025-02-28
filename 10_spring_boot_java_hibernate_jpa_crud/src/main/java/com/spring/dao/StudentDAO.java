package com.spring.dao;

import com.spring.entity.Student;

public interface StudentDAO {
    void save (Student student);
    Student findById(Long id);
}
