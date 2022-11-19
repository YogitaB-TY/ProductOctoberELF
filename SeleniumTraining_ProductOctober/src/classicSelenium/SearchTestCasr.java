package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTestCasr {
	
	public static void main(String[] args) {
		
		
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
