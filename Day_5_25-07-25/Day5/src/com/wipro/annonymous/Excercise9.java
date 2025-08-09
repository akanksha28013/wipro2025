package com.wipro.annonymous;

import java.util.function.Function;

public class Excercise9 {

	public static void main(String[] args) {
		Function<Double, Double> getFraction = num -> num-num.intValue();
		System.out.println(getFraction.apply(123.45));
	}

}
