package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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
