package com.wipro.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from /hello!.";
    }

      @GetMapping("/greet1")
    public String secureEndpoint() {
        return "You are authenticated!";
    }
}
