package com.spring.dao.impl;

import com.spring.dao.StudentDAO;
import com.spring.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {
    //    define field entity manager
    private EntityManager entiytManager;

    public StudentDAOImpl(EntityManager entiytManager) {
        this.entiytManager = entiytManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entiytManager.persist(student);

    }
}
