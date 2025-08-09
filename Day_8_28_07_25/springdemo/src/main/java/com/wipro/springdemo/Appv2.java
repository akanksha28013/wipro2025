package com.wipro.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.springdemo.bean.Mobile;

public class Appv2 {
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(Appv2.class);
		
		ctx.scan("com.wipro.springdemo.*");		

		Mobile mobile= ctx.getBean(Mobile.class);
		System.out.println(mobile.getDisplay());

}
}