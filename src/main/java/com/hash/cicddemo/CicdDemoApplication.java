package com.hash.cicddemo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class CicdDemoApplication {

	public static Logger logger = (Logger) LoggerFactory.getLogger(CicdDemoApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application Started..");
	}

	@GetMapping("/welcome")
	public String greeting(){
		return "Welcome to Hello World...!";
	}

	public static void main(String[] args) {
		logger.info("Application executed***...");
		SpringApplication.run(CicdDemoApplication.class, args);
	}

}
