package sele.testng_test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_Methods {
	@Test(priority = 1)
	void openapp() {
		Assert.assertTrue(false);
	}
	@Test(priority = 2, dependsOnMethods = {"openapp"})
	void login() {
		Assert.assertTrue(true);
	}
	@Test(priority = 3, dependsOnMethods = {"openapp"})
	void search() {
		Assert.assertTrue(true);
	}
	@Test(priority = 4, dependsOnMethods = {"openapp"})
	void advsearch() {
		Assert.assertTrue(true);
	}
	@Test(priority = 5, dependsOnMethods = {"openapp"})
	void logout() {
		Assert.assertTrue(true);
	}
}