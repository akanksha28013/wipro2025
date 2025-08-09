package com.wipro.restapidemo.dto;

public class Mobile {
	 int id;
	 String make;
     String modelNumber;
     double price;

    
    
    public Mobile() {
		super();
	}
	
	
	public Mobile(int id, String make, String modelNumber, double price) {
		super();
		this.id = id;
		this.make = make;
		this.modelNumber = modelNumber;
		this.price = price;
	}


	public Integer getId() {
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

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


	@Override
	public String toString() {
		return "Mobile [id=" + id + ", make=" + make + ", modelNumber=" + modelNumber + ", price=" + price + "]";
	}

    
}
