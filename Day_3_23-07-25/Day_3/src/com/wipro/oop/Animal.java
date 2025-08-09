package com.wipro.oop;

abstract class Animal {
	String name;
	
	Animal(String name)
	{
		this.name=name;
	}
	
	public void eat() {
		System.out.println(name+" is eating");
	}
	abstract void makeSound();

}
