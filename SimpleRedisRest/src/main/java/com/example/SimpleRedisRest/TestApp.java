package com.example.SimpleRedisRest;

import com.example.SimpleRedisRest.interfaces.IEmployeeDao;
import com.example.SimpleRedisRest.pojos.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestApp implements CommandLineRunner {

    @Autowired
    private IEmployeeDao employeeDao;

    @Override
    public void run(String... args)  {

        Employee john = Employee.builder().id(100).name("john").build();
        Employee stacy = Employee.builder().id(101).name("stacy").build();

        employeeDao.saveEmployee(john);
        employeeDao.saveEmployee(stacy);

        System.out.println(employeeDao.getEmployee(100));

    }
}
