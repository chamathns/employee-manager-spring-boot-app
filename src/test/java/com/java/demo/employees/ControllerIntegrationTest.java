package com.java.demo.employees;

import com.java.demo.employees.model.Employee;
import com.java.demo.employees.repositories.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ControllerIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EmployeeRepository employeeRepository;

    @BeforeEach
    public void setUp() {

        employeeRepository.deleteAll();
    }

    // write test case for create employee here
    @Test
    public void testCreateEmployee() {

        Employee employee = new Employee("Alex", "alex@example.com", "1234567890", "test, address");
        Employee savedEmployee = employeeRepository.save(employee);
        Employee existEmployee = entityManager.find(Employee.class, savedEmployee.getId());

        assertThat(existEmployee.getName()).isEqualTo(employee.getName());
    }

    // test case for get employee by name here

    // test case for get all employees here

    // test case for delete employee here

}
