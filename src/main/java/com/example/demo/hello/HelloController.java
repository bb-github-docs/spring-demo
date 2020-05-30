package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/welcome")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {	
		name = "Brian";
		return String.format("Hello %s!", name);
	}
	
}
