package com.testngpro;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer{


 
	
	
	
	
	public RetryListener() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean retry(ITestResult result) {
		
		
		int count =0;
		int limit =4;
		
		if (count<limit) {
			count++;
			return true;
		}
		
		return false;
	}
	
	

}
