package com.example.SimpleRedisRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class SimpleRedisRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRedisRestApplication.class, args);
	}

	@Autowired
	RedisTemplate<String, String> redisTemplate;

	@Bean
	public void testRedis() {
		redisTemplate.opsForValue().set("sum", "200");
		redisTemplate.opsForHash().put("abc", "def", "haha");
		redisTemplate.opsForSet().add("123", "pew");

	}

}
