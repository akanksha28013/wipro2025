package com.wipro.springdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springdemo.bean.College;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
		College clg= ctx.getBean(College.class);
		System.out.println(clg);

	}

}
