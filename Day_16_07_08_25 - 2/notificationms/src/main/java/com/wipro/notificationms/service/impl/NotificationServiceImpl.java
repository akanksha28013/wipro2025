package com.wipro.notificationms.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.notificationms.entity.Notification;
import com.wipro.notificationms.entity.dto.NotificationDTO;
import com.wipro.notificationms.entity.dto.UserDTO;
import com.wipro.notificationms.repo.NotificationRepo;
import com.wipro.notificationms.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService {
	@Autowired
	NotificationRepo notificationRepo;
	@Override
    public void notify(NotificationDTO dto) {
        UserDTO userDto = dto.getUser();
        Notification notification = new Notification();
        notification.setAction(dto.getAction());
        notificationRepo.save(notification);

        System.out.println("User <" + userDto.getUsername() + "> information is <" + dto.getAction() + ">");
    }
}
