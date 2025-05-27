package sele.testng_test;

import org.testng.annotations.Test;

public class Signup_Tests {
	@Test(priority = 1, groups = "regression")
	void signupByEmail() {
		System.out.println("Signup for Email");
	}
	@Test(priority = 2, groups = "regression")
	void signupByFb() {
		System.out.println("Signup for FaceBook");
	}
	@Test(priority = 3, groups = "regression")
	void signupByInsta() {
		System.out.println("Signup for Instagram");
	}
}