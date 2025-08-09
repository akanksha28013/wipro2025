package com.wipro.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FoodItemTest {
			public static void main(String[] args) {
			
			FoodItem f1= new FoodItem("Puran Poli","Veg","Maharashtrian",1000);
			FoodItem f2= new FoodItem("Noodles","Veg","Chinese",300);
			FoodItem f3= new FoodItem("Biryani","NonVeg","Indian",1000);
			FoodItem f4= new FoodItem("Pasta","Veg","Continental",1000);
			FoodItem f5= new FoodItem("Fried Rice", "Veg", "Chinese", 330);
			FoodItem f6= new FoodItem("Manchurian", "Veg", "Chinese", 400);
			
			
			List<FoodItem> foodList= new ArrayList<>();
			foodList.add(f1);
			foodList.add(f2);
			foodList.add(f3);
			foodList.add(f4);
			foodList.add(f5);
			foodList.add(f6);
			
//			
//			Comparator<FoodItem> comp= (a,b)->{
//				Double d1= Double.valueOf(a.foodCuisine);
//				Double d2= Double.valueOf(b.foodCuisine);
//				return d1.compareTo(d2);
//			};
//			
//		
//			List<FoodItem> fList= foodList
//			.stream()
//			.filter(f->f.getFoodCuisine().equalsIgnoreCase("Chines"))
//			.sorted(comp.reversed())
//			.collect(Collectors.toList());
//			
//			System.out.println(fList);
			
			Comparator<FoodItem> comp1= (a,b)->{
				Double d1= Double.valueOf(a.price);
				Double d2= Double.valueOf(b.price);
				return d1.compareTo(d2);
			};
			
			List<FoodItem> fList1 = foodList
	                .stream()
	                .filter(f -> f.getFoodCuisine().equalsIgnoreCase("Chinese"))
	                .sorted(comp1) 
	                .collect(Collectors.toList());
			System.out.println("Most Expensive Chines Dish: ");
			System.out.println(fList1);
			
			
			
		}
	 
	}
	 
	 
