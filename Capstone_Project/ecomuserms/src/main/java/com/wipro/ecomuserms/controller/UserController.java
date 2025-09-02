package com.wipro.ecomuserms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.ecomuserms.dto.Token;
import com.wipro.ecomuserms.entity.User;
import com.wipro.ecomuserms.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/user")
@Tag(name = "User Management", description = "Endpoints for managing users (Admin & Customer)")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    @Operation(
        summary = "Create a new user",
        description = "PUBLIC: Customers can self-register. Admins can register new users from backend."
    )
    public void save(@RequestBody User user) {
        userService.save(user);
    }

  
    @PutMapping
    @Operation(
        summary = "Update existing user profile",
        description = "CUSTOMER: Update own profile. ADMIN: Can update any user."
    )
    public void update(@RequestBody User user) {
        userService.save(user);
    }

  
    @DeleteMapping("/{id}")
    @Operation(
        summary = "Delete a user",
        description = "ADMIN ONLY: Customers cannot delete users."
    )
    public void deleteById(@PathVariable int id) {
        userService.deleteById(id);
    }

      @GetMapping
    @Operation(
        summary = "Get list of all users",
        description = "ADMIN ONLY: Only admins can view all users."
    )
    public List<User> findAll() {
        return userService.findAll();
    }

      @GetMapping("/{id}")
    @Operation(
        summary = "Get user details by ID",
        description = "ADMIN: Can view any user. CUSTOMER: Can only view own details."
    )
    public User findById(@PathVariable int id) {
        return userService.findById(id);
    }

  
    @GetMapping("/menu/{id}")
    @Operation(
        summary = "Get user menu",
        description = "CUSTOMER: Gets customer menu. ADMIN: Gets admin menu."
    )
    public String getMenu(@PathVariable int id) {
        return userService.getMenu(id);
    }

  
    @PostMapping("/login")
    @Operation(
        summary = "Login with userId and password",
        description = "PUBLIC: Returns JWT token after successful login."
    )
    public Token login(@RequestBody User user) {
    	System.out.println("📥 Incoming Login Request: " + user);
        return userService.login(user);
    }

    @PostMapping("/logout")
    @Operation(
        summary = "Logout user",
        description = "CUSTOMER & ADMIN: Invalidates user session and sets isLoggedIn=false."
    )
    public void logout(@RequestBody User user) {
        userService.logout(user);
    }
}