package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void sanityTest(){
		assertEquals(20, 20);
	}

	@Test
	public void otherSanityTest(){
		assertEquals(20, 20);
	}
}
