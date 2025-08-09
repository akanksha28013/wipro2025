package com.wipro.stream;

public class FoodItem {
	String foodName;
	String foodType;
	String foodCuisine;
	double price;
	
	
	public FoodItem(String foodName, String foodType, String foodCuisine, double price) {
		super();
		this.foodName = foodName;
		this.foodType = foodType;
		this.foodCuisine = foodCuisine;
		this.price = price;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getFoodCuisine() {
		return foodCuisine;
	}
	public void setFoodCuisine(String foodCuisine) {
		this.foodCuisine = foodCuisine;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodItem [foodName=" + foodName + ", foodType=" + foodType + ", foodCuisine=" + foodCuisine + ", price="
				+ price + "]";
	}
	
	

}
