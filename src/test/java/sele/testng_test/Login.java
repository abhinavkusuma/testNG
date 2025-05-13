package sele.testng_test;

import org.testng.annotations.Test;

public class Login {
	@Test(priority = 1)
	void openapp() {
		System.out.println("Opening Application.....");
	}
	@Test(priority = 2)    
	void login() {
		System.out.println("Login Application.....");
	}
	@Test(priority = 3)
	void closeapp() {
		System.out.println("closing Application....");
	}
}
