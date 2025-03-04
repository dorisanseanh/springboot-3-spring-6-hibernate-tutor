package com.spring.repository;


import com.spring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
//@RepositoryRestResource: is an annotation in Spring Data REST that automatically exposes RESTful endpoints
// for your repository — without needing to write a controller manually.
@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
