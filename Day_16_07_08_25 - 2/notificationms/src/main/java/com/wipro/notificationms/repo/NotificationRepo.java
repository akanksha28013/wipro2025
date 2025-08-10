package com.wipro.notificationms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.notificationms.entity.Notification;


public interface NotificationRepo extends JpaRepository<Notification, Long>{

}
