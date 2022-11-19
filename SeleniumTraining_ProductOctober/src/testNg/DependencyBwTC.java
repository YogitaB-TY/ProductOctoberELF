package testNg;

import org.testng.annotations.Test;

public class DependencyBwTC {
	
	@Test(groups = "Regression")
	public void harryPotter() {
		System.out.println("Harry Potter");
	}
	
	@Test(groups="Kannada")
	public void kgf() {
		System.out.println("KGF");
		
	}
	
	@Test(groups = "Smoke")
	public void GOT() {
		System.out.println("GOT");
	}
	
	@Test(groups = "English")
	public void HouseOFDragons() {
		System.out.println("Wakanda Forever");
		
	}
	
	@Test(groups = "Kannada")
	public void kantara() {
		System.out.println("Kantara");
		//int i=1/0;
	}

}
