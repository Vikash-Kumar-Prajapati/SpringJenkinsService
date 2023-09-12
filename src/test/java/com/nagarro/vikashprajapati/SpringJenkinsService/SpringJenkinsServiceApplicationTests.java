package com.nagarro.vikashprajapati.SpringJenkinsService;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsServiceApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsServiceApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case Executing..............");
		assertEquals(true, true);
	}

}
