package com.example.rest.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDB {

    private static final Logger log = LoggerFactory.getLogger(LoadDB.class);

    // shouldn't be empty - why ?
    @Bean
    CommandLineRunner initDB(EmployeeRepo repo) {
        return args -> {
            log.info(repo.save(new Employee("Rose")).toString());
            log.info(repo.save(new Employee("Jane")).toString());
        };
    }


}
