package com.wipro.carinfo.Entity;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
public class CarRegDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;

     String registrationNumber;

     LocalDate dateOfRegistration;

    
    public CarRegDetail() {
    }

    public CarRegDetail(String registrationNumber, LocalDate dateOfRegistration) {
        this.registrationNumber = registrationNumber;
        this.dateOfRegistration = dateOfRegistration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }
}
