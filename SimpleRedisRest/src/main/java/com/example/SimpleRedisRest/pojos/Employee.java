package com.example.SimpleRedisRest.pojos;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Employee implements Serializable {
    private final long id;
    private final String name;
}
