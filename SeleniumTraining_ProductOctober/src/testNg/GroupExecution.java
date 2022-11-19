package testNg;

import org.testng.annotations.Test;

public class GroupExecution {
	
	@Test(groups = "Smoke")
	public void payment() {
		System.out.println("Payment");
	}
	
	@Test(groups  = "Smoke")
	public void Login() {
		System.out.println("Login");
	}
	
	@Test(groups  = "Smoke")
	public void Register() {
		System.out.println("Register");
	}
	@Test(groups  = "Regression")
	public void Profile() {
		System.out.println("Profile");
	}
	

}
