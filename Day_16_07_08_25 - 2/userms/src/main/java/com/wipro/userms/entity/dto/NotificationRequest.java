package com.wipro.userms.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
public class NotificationRequest {
	
	String action;
	UserDTO user;


}
