package com.testngpro;

import org.testng.annotations.Test;
import org.testng.internal.GroupsHelper;

public class Group_testing {


	@Test(groups = "software Testing")
	private void uiTesting() {

		System.out.println("ui testing");
	}

	@Test(groups = "software Testing")
	private void apiTesting() {

		System.out.println("api testing ");

	}

	@Test(groups = "Browser Testing")
	private void googleTest() {

		System.out.println("google browser");
	}

	@Test(groups = "Browser Testing")
	private void fireFoxBrowser( ) {

		System.out.println("Fire Fox Browser");


	}


	@Test(groups = "Mobiles")
	private void iphone() {

		System.out.println("iphone mobiles");

	}

	@Test(groups = "Mobiles")
	private void realmeeeee() {

		System.out.println("realme mobiles");
	}

}
