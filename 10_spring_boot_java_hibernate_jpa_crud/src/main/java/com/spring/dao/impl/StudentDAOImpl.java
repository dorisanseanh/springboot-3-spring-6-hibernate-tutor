package com.spring.dao.impl;

import com.spring.dao.StudentDAO;
import com.spring.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
    //    define field entity manager
    private EntityManager entiytManager;

    public StudentDAOImpl(EntityManager entityManager) {
        this.entiytManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entiytManager.persist(student);

    }

    @Override
    public Student findById(Long id) {
        return entiytManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
//        create query
        TypedQuery<Student> query = entiytManager.createQuery("FROM Student order by lastName desc ", Student.class);
//        return query results
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> query = entiytManager.createQuery("FROM Student where lastName = :lastName", Student.class);
        query.setParameter("lastName", lastName);
        return query.getResultList();
    }


}
