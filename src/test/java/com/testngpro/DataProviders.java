package com.testngpro;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class DataProviders {
	
	
	@DataProvider
	private Object[][] testData() {
		
	 return	new Object [][]  {	{"admin1","admoin@123"},
							{"admin2","admin@123"},
							{"admin3","admin@123"}};
		
		
	}
	
	@Test(dataProvider = "testData")
	private void credential(String userNmae, String passWord) {
		
		System.out.println("user name "+ userNmae +" password is " +passWord );
		
	}

}
