package com.example.rest.payroll;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private final EmployeeRepo repo;

    EmployeeController(EmployeeRepo repo) {
        this.repo = repo;
    }

    @PostMapping("/employees")
    Employee createOne(@RequestBody Employee employee) {
        return repo.save(employee);
    }

    @GetMapping("/employees/{id}")
    Employee readOne(@PathVariable Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @GetMapping("/employees")
    List<Employee> getAll() {
        return repo.findAll();
    }

}
