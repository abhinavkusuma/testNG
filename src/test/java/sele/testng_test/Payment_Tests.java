package sele.testng_test;

import org.testng.annotations.Test;

public class Payment_Tests {
	@Test(priority = 1, groups = {"sanity","regression","functional"})
	void paymentinRupees() {
		System.out.println("In Rupees");
	}
	@Test(priority = 2, groups = {"sanity","regression","functional"})
	void paymentinDollars() {
		System.out.println("In Dollars");
	}
}