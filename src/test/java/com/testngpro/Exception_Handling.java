package com.testngpro;

import org.testng.annotations.Test;

public class Exception_Handling {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void exception() {
		
		int a =10;
		int b = 0;
		
		int c = 10/0;
	}
	
	
	@Test
	private void add() {
		
		int a =10;
		int b =20;
		int c = a+b;
	}

}
