package com.java.demo.employees.repositories;

import com.java.demo.employees.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //save employee
    Employee save(Employee employee);

    //get employee by name
    Employee findByName(String name);

    // list all employees
    List<Employee> findAll();

    // delete employee by id
    void deleteById(int id);
}
