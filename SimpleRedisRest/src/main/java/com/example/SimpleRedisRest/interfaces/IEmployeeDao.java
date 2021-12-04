package com.example.SimpleRedisRest.interfaces;

import com.example.SimpleRedisRest.pojos.Employee;

public interface IEmployeeDao {
    void saveEmployee(Employee e);
    Employee getEmployee(long employeeId);
    void updateEmployee(Employee e);
    void deleteEmployee(long employeeId);
}
