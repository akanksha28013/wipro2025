package com.wipro.ecomuserms.service;

import java.util.List;
import com.wipro.ecomuserms.dto.Token;
import com.wipro.ecomuserms.entity.User;

public interface UserService {
    List<User> findAll();
    User findById(int id);
    void deleteById(int id);
    void save(User user);
    Token login(User user);
    void logout(User user);
    String getMenu(int id);
}