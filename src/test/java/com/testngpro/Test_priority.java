package com.testngpro;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test_priority {
	
	
	@Test(priority = -10)
	private void Setup() {
		
		System.out.println("Setup");
		
	}
	
	
	
	@Test(priority = -1)
	private void browserLanch() {
		
		System.out.println("browserLanch");
		
	}
	
	@Test(priority = 0)
	private void urlSetup() {
		
		System.out.println("urlSetup");
		
	}
	
	@Test(priority = 1)
	private void logIn() {
		
		System.out.println("login");
		
	}
	
	@Test(priority = 2 , enabled = false)
	private void searchMobiles () {
		
		System.out.println("searchmobiles");
		
	}
	
	@Test(priority = 3)
	private void serachLaptop() {
		
		System.out.println("searchLaptop");
		
	}
	
	@Test(priority = 4)
	private void logout() {
		
		System.out.println("logout");

	}
	
	@Test(priority = 5 , invocationCount = 10)
	@Ignore
	private void tearDown() {
	
		System.out.println("All browser closed");

	}
	

}
