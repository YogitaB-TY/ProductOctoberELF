package testNg;

import org.testng.annotations.Test;

public class PrioritisingTestCases {
	
	@Test(priority = 1)
	public void register() {
		System.out.println("Register Test Case");
	}
	
	@Test (priority = 4)
	public void AddToCart() {
		System.out.println("Add To cart");
	}
	
	@Test(priority = 2)
	public void login() {
		System.out.println("Login test case");
	}
	
	@Test(priority = -1)
	public void wishlist() {
		System.out.println("Wishlist test case");
	}

}
