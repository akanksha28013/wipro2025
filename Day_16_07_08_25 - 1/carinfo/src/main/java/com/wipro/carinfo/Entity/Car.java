package com.wipro.carinfo.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
     String make;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "car_registration_id", referencedColumnName = "id")
     CarRegDetail regDetail;
    
    public Car() {
    }
    
    

	public Car(int id, String make, CarRegDetail regDetail) {
		super();
		this.id = id;
		this.make = make;
		this.regDetail = regDetail;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public CarRegDetail getRegDetail() {
		return regDetail;
	}

	public void setRegDetail(CarRegDetail regDetail) {
		this.regDetail = regDetail;
	}
 
    
    
}
