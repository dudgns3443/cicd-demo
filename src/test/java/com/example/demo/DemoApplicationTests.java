package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
   	private TestRestTemplate restTemplate;


	@Test
	void contextLoads() {
		ResponseEntity<String> response = restTemplate.getForEntity("/", String.class); 

	        // HTTP 상태 코드가 200(OK)인지 확인합니다.
	        assertEquals(HttpStatus.OK, response.getStatusCode());
	}

}
