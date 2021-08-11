package com.spring.hellocontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HellorestController {
	@RequestMapping(value= {"","/","home"})
	public String sayHello() {
		return "Hello from the bridgelabz to this message";
	}
}
