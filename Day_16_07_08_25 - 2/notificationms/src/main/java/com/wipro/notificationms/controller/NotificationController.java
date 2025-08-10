package com.wipro.notificationms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.notificationms.entity.Notification;
import com.wipro.notificationms.entity.dto.NotificationDTO;
import com.wipro.notificationms.repo.NotificationRepo;
import com.wipro.notificationms.service.NotificationService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping()
@RequiredArgsConstructor
public class NotificationController {
	@Autowired
    NotificationRepo repo;

    @PostMapping("/notify")
    public ResponseEntity<String> sendNotification(@RequestBody NotificationDTO request) {
        String username = request.getUser().getUsername();
        String address = request.getUser().getAddress();
        String action = request.getAction();

       
        Notification notification = new Notification(null, username, address, action);
        repo.save(notification);

        System.out.println("📩 Notification saved: " + action + " for user " + username);
        return ResponseEntity.ok("Notification saved");
    }}
