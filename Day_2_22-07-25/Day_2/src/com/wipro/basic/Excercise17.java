package com.wipro.basic;

public class Excercise17 {

	enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
        
        System.out.println("All months:");
        for (Month m : Month.values()) {
            System.out.println(m);
        }
        Month month = Month.FEBRUARY;
        if (month == Month.FEBRUARY) {
            System.out.println("The assigned month is FEBRUARY.");
        } else {
            System.out.println("The assigned month is not FEBRUARY.");
        }	}

}
