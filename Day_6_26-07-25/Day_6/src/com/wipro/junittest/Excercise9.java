package com.wipro.junittest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Excercise9 {

	@ParameterizedTest
	@ValueSource(strings= {"dfg","xyz"})
	void checkLowerString(String str)
	{
		assertTrue(str.equals(str.toLowerCase()));
		
	}

	
}
