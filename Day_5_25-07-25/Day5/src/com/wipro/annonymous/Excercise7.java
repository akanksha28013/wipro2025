package com.wipro.annonymous;

import java.util.function.Consumer;

public class Excercise7 {

	public static void main(String[] args) {
		Consumer<Integer> num = number -> {
			int nextEven;
			if(number%2==0)
			{
				nextEven = number+2;
			}
			else
			{
				nextEven = number+1;
			}
			System.out.println("The Next Even Number is: "+number+" is: "+nextEven);
		};
		
		num.accept(5);
		num.accept(100);
	}

}
