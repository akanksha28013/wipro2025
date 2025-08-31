package com.wipro.ecomuserms.service.impl;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.wipro.ecomuserms.dto.Token;
import com.wipro.ecomuserms.entity.User;
import com.wipro.ecomuserms.entity.repo.UserRepo;
import com.wipro.ecomuserms.service.UserService;
import com.wipro.ecomuserms.util.AppConstant;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final BCryptPasswordEncoder passwordEncoder;

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findById(int id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public void save(User user) {
        System.out.println("📥 Incoming User Save Request: " + user);

        if (user.getPassword() != null && !user.getPassword().startsWith("$2a$")) {
            System.out.println("Before encoding: " + user.getPassword());
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            System.out.println("After encoding: " + user.getPassword());
        }

        userRepo.save(user);
    }

    @Override
    public Token login(User loginRequest) {
        Optional<User> userOpt = userRepo.findByUserId(loginRequest.getUserId());
        if (userOpt.isEmpty()) {
            return new Token(null, "User not found");
        }

        User user = userOpt.get();

        if (loginRequest.getPassword() == null) {
            return new Token(null, "Password cannot be null");
        }

        if (!passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
            return new Token(null, "Invalid password");
        }

        user.setLoggedIn(true);
        userRepo.save(user);

        String jwt = Jwts.builder()
                .setSubject(user.getUserId())
                .claim("role", user.getUserType() == 0 ? "ADMIN" : "CUSTOMER")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000))
                .signWith(Keys.hmacShaKeyFor(AppConstant.SECRET.getBytes(StandardCharsets.UTF_8)),
                        SignatureAlgorithm.HS512)
                .compact();

        return new Token(jwt, "Login successful");
    }

    @Override
    public void logout(User userRequest) {
        Optional<User> userOpt = userRepo.findByUserId(userRequest.getUserId());
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            user.setLoggedIn(false);
            userRepo.save(user);
        }
    }

    @Override
    public String getMenu(int id) {
        User user = findById(id);
        if (user == null) return "User not found";

        if (user.getUserType() == 0) {
            return "Admin Menu: [Manage Catalogue, Manage Inventory, Reports]";
        } else {
            return "Customer Menu: [Browse Catalogue, View Orders, Profile Settings]";
        }
    }
}
