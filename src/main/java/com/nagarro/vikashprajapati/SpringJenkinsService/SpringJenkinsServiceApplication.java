package com.nagarro.vikashprajapati.SpringJenkinsService;

import jakarta.annotation.PostConstruct;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringJenkinsServiceApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsServiceApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application Started.........");

	}

	public static void main(String[] args) {
		logger.info("Application Executing in Main method..........");
		SpringApplication.run(SpringJenkinsServiceApplication.class, args);
	}

}
