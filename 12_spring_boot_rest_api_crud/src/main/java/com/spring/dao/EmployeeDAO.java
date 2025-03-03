package com.spring.dao;

import com.spring.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

}
