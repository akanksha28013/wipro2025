package com.wipro.userms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.wipro.userms.entity.User;
import com.wipro.userms.entity.dto.NotificationRequest;
import com.wipro.userms.entity.dto.UserDTO;
import com.wipro.userms.repo.UserRepo;
import com.wipro.userms.service.UserService;

@Service
public class UserServiceImpl implements UserService {
		@Autowired
	    UserRepo userRepo;
		 @Autowired
	    RestTemplate restTemplate;

	    @Value("${notification.service.url}")
	     String notificationUrl;

	    private void notifyService(User user, String action) {
	        NotificationRequest request = new NotificationRequest();
	        request.setUser(new UserDTO(user.getUsername(), user.getPassword(), user.getAddress()));
	        request.setAction(action);
	        restTemplate.postForObject(notificationUrl + "/notify", request, String.class);
	    }

	    @Override
	    public User createUser(UserDTO userDto) {
	        User user = new User(null, userDto.getUsername(), userDto.getPassword(), userDto.getAddress());
	        user = userRepo.save(user);
	        notifyService(user, "CREATED");
	        return user;
	    }

	    @Override
	    public User updateUser(Long id, UserDTO userDto) {
	        User user = userRepo.findById(id).orElseThrow();
	        user.setUsername(userDto.getUsername());
	        user.setPassword(userDto.getPassword());
	        user.setAddress(userDto.getAddress());
	        user = userRepo.save(user);
	        notifyService(user, "UPDATED");
	        return user;
	    }

	    @Override
	    public void deleteUser(Long id) {
	        User user = userRepo.findById(id).orElseThrow();
	        userRepo.deleteById(id);
	        notifyService(user, "DELETED");
	    }

	    @Override
	    public List<User> getAllUsers() {
	        return userRepo.findAll();
	    }

	    @Override
	    public User getUserById(Long id) {
	        return userRepo.findById(id).orElseThrow();
	    }
	}


