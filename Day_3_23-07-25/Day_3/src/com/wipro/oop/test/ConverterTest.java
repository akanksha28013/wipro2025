package com.wipro.oop.test;

import com.wipro.oop.Converter;

public class ConverterTest {

	public static void main(String[] args) {
		Converter converter = new Converter();
		System.out.println(converter.convert(12));
		System.out.println(converter.convert(82,45));
		System.out.println(converter.convert(12.4d));
	}

}
