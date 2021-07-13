package com.testngpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Testing {
	
	
	public static WebDriver driver;
	
	
	@Test
	private void openGoogle() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\firstProject\\driverfolder\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	
	@Test
	private void openYahoo() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\firstProject\\driverfolder\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/");
	}
	
	@Test
	private void openAmazon() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\firstProject\\driverfolder\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}
	
	

}
