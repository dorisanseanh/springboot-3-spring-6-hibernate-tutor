package com.spring.controller;

import com.spring.dao.EmployeeDAO;
import com.spring.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private EmployeeDAO employeeDAO;
    public EmployeeController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/employee")
    public List<Employee> getEmployees() {
        return employeeDAO.findAll();
    }
}
