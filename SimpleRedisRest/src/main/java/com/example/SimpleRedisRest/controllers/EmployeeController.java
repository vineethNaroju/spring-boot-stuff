package com.example.SimpleRedisRest.controllers;

import com.example.SimpleRedisRest.pojos.Employee;
import com.example.SimpleRedisRest.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private final EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping("/employee")
    public void createEmployee(@RequestBody Employee e) {
        service.saveEmployee(e);
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return service.getEmployee(Long.parseLong(id));
    }

    @PostMapping("/employee/update")
    public void updateEmployee(@RequestBody Employee e) {
        service.updateEmployee(e);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable String id) {
        service.deleteEmployee(Long.parseLong(id));
    }
}
