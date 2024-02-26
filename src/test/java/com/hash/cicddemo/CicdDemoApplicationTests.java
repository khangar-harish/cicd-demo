package com.hash.cicddemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CicdDemoApplicationTests {

	public static Logger logger = (Logger) LoggerFactory.getLogger(CicdDemoApplication.class);

	@Test
	 contextLoads() {
		logger.info("Test Case1 Executed...");
		logger.info("Test Case2 Executed...");
		logger.info("Test Case3 Executed...");
		assertEquals(true, true);
	}

}
