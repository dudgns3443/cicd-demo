package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
    	private TestRestTemplate restTemplate;
	@Test
	@DisplayName("is Hello Test works?")
	void contextLoads() {
		ResponseEntity<String> response = restTemplate.getForEntity("/api/hello", String.class); 

		assertEquals(HttpStatus.OK, response.getStatusCode());
	}

}
