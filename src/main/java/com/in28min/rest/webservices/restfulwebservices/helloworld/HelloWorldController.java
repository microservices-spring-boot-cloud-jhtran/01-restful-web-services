package com.in28min.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// REST API
@RestController
public class HelloWorldController {
	
	// "/hello-world"
    @GetMapping("/hello-world")
	public String helloWorld() {
		
		return "Hello World";
	}

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        
        return new HelloWorldBean("Hello World");
    }
    
}
