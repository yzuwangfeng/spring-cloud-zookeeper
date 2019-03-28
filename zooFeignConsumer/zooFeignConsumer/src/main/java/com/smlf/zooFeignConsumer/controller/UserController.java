package com.smlf.zooFeignConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.smlf.zooFeignConsumer.feignclient.GreetService;

@RestController
public class UserController {
	
	@Autowired
	private GreetService greetService;
	
	@GetMapping(value="/user/{username}")
	public String greetUser(@PathVariable String username) {
		return greetService.greet(username);
	}

}
