package com.wipro.firstboot.repo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.wipro.firstboot.entity.User;

@Controller
public class UserContoller {
	@GetMapping("/userreg")
    public String showRegData(Model model) {
        model.addAttribute("user", new User());
        return "userreg"; 
    }

    @PostMapping("/registerUser")
    public String handleFormSubmit(@ModelAttribute("user") User user) {
        System.out.println("Received user data:");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getUserEmail());
        System.out.println("Phone: " + user.getUserPhone());
        return "success"; 
    }

    
}
