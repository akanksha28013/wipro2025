package com.wipro.ecomuserms.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private String emailId;

    @Column(unique = true, nullable = false)
    private String userId;   

    @Column(name = "password")
    private String password; 
    private String address;

    private int userType;   
    private boolean isLoggedIn;
}