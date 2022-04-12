package com.example.rest.payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

// object is ready for storage in jpa-based data store
@Entity
public class Employee {
    // attribute, primary key, automatically populated by jpa
    private @Id @GeneratedValue Long id;

    // attribute
    private String name;

    Employee(){}

    Employee(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{id:" + id + ",name:" + name + "}";
    }
}
