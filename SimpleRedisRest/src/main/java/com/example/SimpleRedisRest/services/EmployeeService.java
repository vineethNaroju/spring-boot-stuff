package com.example.SimpleRedisRest.services;

import com.example.SimpleRedisRest.interfaces.IEmployeeDao;
import com.example.SimpleRedisRest.pojos.Employee;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class EmployeeService implements IEmployeeDao {

    private final String hashReference = "Employee";

    @Resource(name = "employeeRedisTemplate")
    private HashOperations<String, Long, Employee> hashOps;


    @Override
    public void saveEmployee(Employee e) {
        hashOps.putIfAbsent(hashReference, e.getId(), e);
    }

    @Override
    public Employee getEmployee(long employeeId) {
        return hashOps.get(hashReference, employeeId);
    }

    @Override
    public void updateEmployee(Employee e) {
        hashOps.put(hashReference, e.getId(), e);
    }

    @Override
    public void deleteEmployee(long employeeId){
        hashOps.delete(hashReference, employeeId);
    }
}
