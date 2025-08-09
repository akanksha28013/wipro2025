package com.wipro.exceptiontest;

import com.wipro.exception.InvalidMonthException;

public class InvalidMonthExceptionTest {
	public void checkMonth(int month) throws InvalidMonthException{
		if(month>12) {
			throw new InvalidMonthException("Inavlid month "+month);
		}
		else {
			System.out.println(month+" is invalid");
		}
	}

	public static void main(String[] args) {
		
	}

}
