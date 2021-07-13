package com.testngpro;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	
	@Test
	@Parameters({"userName","passWord"})
	private void credentials(@Optional("greenTech") String userName , String passWord) {
		
		System.out.println("username is "+userName + " password is "+passWord);
		

	}

}
