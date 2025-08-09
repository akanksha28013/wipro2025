package com.wipro.oop.test;

import com.wipro.oop.Circle;
import com.wipro.oop.Rectangle;
import com.wipro.oop.Square;

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setColor("Red");
		circle.setRadius(2.3);
		circle.setLength(3.2d);
		circle.setWidth(4.1);
		System.out.println(circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setColor("Blue");
		rectangle.setRadius(2.3);
		rectangle.setLength(3.2d);
		rectangle.setWidth(4.1);
		System.out.println(rectangle);
		
		Square square = new Square();
		square.setColor("Black");
		square.setRadius(2.3);
		square.setLength(3.2d);
		square.setWidth(4.1);
		System.out.println(square);
		
		
		
	}

}
