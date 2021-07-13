package com.testngpro;

import org.testng.annotations.Test;

public class Timeout {
	
	@Test(timeOut = 3000)
	private void browserLanch() throws InterruptedException {
		
		//Thread.sleep(5000);
		System.out.println("browser is lanch");
		
	}
	
	@Test(timeOut = 3000)
	private void login() {
		
		System.out.println("users are log in here");
	}
	

}
