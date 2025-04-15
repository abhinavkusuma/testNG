package sele.testng_test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_Practise {
	@BeforeMethod
	void login() {
		System.out.println("Login Successfully");
	}
	@Test(priority = 1)
	void search() {
		System.out.println("Searching the Product");
	}
	@AfterMethod
	void logout() {
		System.out.println("Logout Successfully");
	}
	@Test(priority = 2)
	void advsearch() {
		System.out.println("Advance Search");
	}
}