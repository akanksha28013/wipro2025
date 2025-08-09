package com.wipro.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class StringTest {
	 @Test
	    public void testNullPointerException() {
	        
		 String str = null;

	        assertThrows(NullPointerException.class, () -> {
	            str.toUpperCase();
	        });	 
	 }
}
