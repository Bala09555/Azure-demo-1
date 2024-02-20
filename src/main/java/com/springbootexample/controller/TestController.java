package com.springbootexample.controller;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private Logger logger=LoggerFactory.getLogger(TestController.class);
	@GetMapping ("/api")
	public Object hello() {
		Map<String, String> object = new HashMap<>();
		object.put("name", "Rntci");
		object.put("email", "rntbci@gmail.com");
		logger.info("Welcome to Azure");
		return object;
	}

}
