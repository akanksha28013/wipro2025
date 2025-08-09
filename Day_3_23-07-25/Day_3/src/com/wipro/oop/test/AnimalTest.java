package com.wipro.oop.test;

import com.wipro.oop.Bird;
import com.wipro.oop.Dog;
import com.wipro.oop.Human;

public class AnimalTest {

	public static void main(String[] args) {
		Human h = new Human("Bob");
		Bird b = new Bird("Saprrow"); 
		Dog d = new Dog("Max"); 
		
		h.eat();
		h.makeSound();
		
		b.eat();
		b.makeSound();
		
		d.eat();
		d.makeSound();
		
		
		
		
	}

}
