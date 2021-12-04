package com.example.SimpleRest.pojos;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Greeting {
    private final long id;
    private final String content;
}
