package com.example.rest.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

// create new employees, update existing ones, delete employees, find etc.
interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
