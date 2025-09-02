package com.wipro.ecomuserms.entity.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.ecomuserms.entity.User;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    Optional<User> findByUserId(String userId);
    Optional<User> findByEmailId(String emailId);
}