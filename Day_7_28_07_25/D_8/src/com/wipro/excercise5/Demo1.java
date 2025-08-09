package com.wipro.excercise5;

import java.util.Arrays;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
		  
		  List<String> list=Arrays.asList("jaya","amit","ravi");
		  list
		  .stream()
		  //.map(str->StringUtils.capitalize(str))
		  .map(StringUtils::toUpperCase)
		  //.forEach(a->System.out.println(a));
		  .forEach(System.out::println);
        
	}

}
