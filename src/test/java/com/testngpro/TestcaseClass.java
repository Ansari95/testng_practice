package com.testngpro;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestcaseClass {
	
	@Test(retryAnalyzer = RetryListener.class)
	private void testCase1() {
		
		
	
	Assert.assertEquals(true, false);
	
		
		
	}

}
