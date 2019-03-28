package com.smlf.zooFeignProvider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@GetMapping(value="/greet/{username}")
	public String Greet(@PathVariable String username) {
		return "Hi " + username;
	}
}
