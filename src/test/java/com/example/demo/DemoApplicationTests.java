package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
    	private TestRestTemplate restTemplate;
	@Test
	@DisplayName("승인 여부와 함께 모든 파티 그룹을 조회한다")
	void contextLoads() {
		ResponseEntity<String> response = restTemplate.getForEntity("/api/test", String.class); 

		assertTrue(response.getBody().contains("Hello, World!"));
	}

}
