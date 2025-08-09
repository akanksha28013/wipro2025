package com.wipro.thymeleafdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hello")
	String showWelcome(Model m)
	{
		m.addAttribute("name", "Akanksha");
		m.addAttribute("email", "akanksha@gmail.com");
		return "index";		
	}

}
