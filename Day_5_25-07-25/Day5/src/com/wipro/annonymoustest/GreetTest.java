package com.wipro.annonymoustest;

import com.wipro.annonymous.Greet;

public class GreetTest {

	public static void main(String[] args) {
		Greet greet=() ->{System.out.println("Hello Lambda....");};
		greet.sayHello();
	}

}
