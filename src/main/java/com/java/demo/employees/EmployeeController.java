package com.java.demo.employees;

import com.java.demo.employees.model.Employee;
import com.java.demo.employees.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }

    @PostMapping("/create")
    public ResponseEntity createEmployee(@RequestBody Employee employee) {

        employeeRepository.save(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(employee.toString());
    }
}
