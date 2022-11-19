package testNg;

import org.testng.annotations.Test;

public class LearningTestNg {

	@Test
	public void sampleTestCase() {
		//inside test annotation method body
		
		System.out.println("Test case 1");
		//int i=1/0;
	}
	
	@Test
	public void loginTestCase() {
		System.out.println("Login test case");
	}
	
	@Test
	public void aTestCase() {
		System.out.println("TestCase 3");
	}
}
