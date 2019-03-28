package com.smlf.zooFeignConsumer.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "Greeting")
public interface GreetService {
	
	@RequestMapping(value="/greet/{username}")
	String greet(@PathVariable("username") String username);

}
