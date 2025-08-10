package com.wipro.userms.service;

import java.util.List;

import com.wipro.userms.entity.User;
import com.wipro.userms.entity.dto.UserDTO;

public interface UserService {
	User createUser(UserDTO userDto);
    User updateUser(Long id, UserDTO userDto);
    void deleteUser(Long id);
    List<User> getAllUsers();
    User getUserById(Long id);

}
