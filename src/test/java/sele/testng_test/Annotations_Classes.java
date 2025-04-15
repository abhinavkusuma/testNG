package sele.testng_test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations_Classes {
	@BeforeClass
	void login() {
		System.out.println("This is Login");
	}
	@Test(priority = 1)
	void search() {
		System.out.println("This is Search");
	}
	@Test(priority = 2)
	void advsearch() {
		System.out.println("This is Advance Search");
	}
	@AfterClass
	void logout() {
		System.out.println("This is Logout");
	}
}