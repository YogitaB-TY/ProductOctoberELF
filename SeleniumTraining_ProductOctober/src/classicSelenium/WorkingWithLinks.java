package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//linktext
		WebElement registerLink=driver.findElement(By.linkText("Register"));
		registerLink.click();
		
		
		WebElement loginLink=driver.findElement(By.linkText("Log in"));
		loginLink.click();
		
		
		//partial Link text
		
		WebElement booksLink=driver.findElement(By.partialLinkText("BOOKS"));
		booksLink.click();

	}

}
