package com.wipro.oop;

public class Shape {
	String color;
	double radius;
	double length;
	double width;
	
	
		public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Shape [color=" + color + ", radius=" + radius + ", length=" + length + ", width=" + width + "]";
	}
	
	

}
