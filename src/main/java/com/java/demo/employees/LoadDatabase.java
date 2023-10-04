package com.java.demo.employees;

import com.java.demo.employees.model.Employee;
import com.java.demo.employees.repositories.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("John Doe", "johndoe@example.com", "5555550001",
                    "123 Main St, Anytown, CA 12345")));
            log.info("Preloading " + repository.save(new Employee("Jane Smith", "janesmith@example.com", "5555550002",
                    "456 Oak St, Anytown, CA 12345")));
        };
    }
}
