package com.testngpro;

import org.testng.annotations.Test;

public class GroupOfGroup_Testing {
	
	@Test(groups = "software Testing2")
	private void uiTesting() {

		System.out.println("ui testing");
	}

	@Test(groups = "software Testing2")
	private void apiTesting() {

		System.out.println("api testing ");

	}

	@Test(groups = "Browser Testing2")
	private void googleTest() {

		System.out.println("google browser");
	}

	@Test(groups = "Browser Testing2")
	private void fireFoxBrowser( ) {

		System.out.println("Fire Fox Browser");


	}


	@Test(groups = "Mobiles2")
	private void iphone() {

		System.out.println("iphone mobiles");

	}

	@Test(groups = "Mobiles2")
	private void realme() {

		System.out.println("realme mobiles");
	}

}
	

