package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SameTCMultipleTimes {
	
	@Test(invocationCount = 4)
	public void testCase() {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		// "Hello"
		System.out.println("\"Hello\"");
		WebElement searchTF=driver.findElement(By.cssSelector("input[value='Search store']"));
		searchTF.sendKeys("Computers");
	}

}
