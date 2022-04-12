package com.example.rest.payroll;

public class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(Long id) {
        super("employee with id:" + id + " is not found");
    }
}
