package com.spring.dao.impl;

import com.spring.dao.EmployeeDAO;
import com.spring.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
        return query.getResultList();
    }

    @Override
    public Employee findById(int id) {
//        Get id employee
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    //fix: Automatically handle insert and update by using merge
    //instead of persist to avoid IllegalArgumentException
    // merge include update and add new item
    @Override
    public Employee save(Employee employee) {
        entityManager.merge(employee); // Tự động xử lý cả insert lẫn update
        return employee;
    }

    @Override
    public void delete(int id) {
        entityManager.remove(entityManager.find(Employee.class, id));
    }
}

