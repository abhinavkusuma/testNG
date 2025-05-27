package sele.testng_test;

import org.testng.annotations.Test;

public class Login_Tests {
	@Test(priority = 1, groups = "sanity")
	void loginByEmail() {
		System.out.println("This is Email");
	}
	@Test(priority = 2, groups = "sanity")
	void loginByFb() {
		System.out.println("This is FaceBook");
	}
	@Test(priority = 3, groups = "sanity")
	void loginByInsta() {
		System.out.println("This is Instagram");
	}
}