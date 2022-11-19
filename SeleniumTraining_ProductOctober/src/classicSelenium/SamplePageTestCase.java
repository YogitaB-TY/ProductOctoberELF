package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePageTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Documents/Selenium/HTML-Pages/LocatorsPractice.html");
		
		WebElement userNameTF= driver.findElement(By.className("username"));
		userNameTF.sendKeys("yogita");
		
		WebElement passwordTF= driver.findElement(By.className("password"));
		passwordTF.sendKeys("1234");
		
		WebElement checkBox= driver.findElement(By.className("checkbox"));
		checkBox.click();
		
		WebElement femaleRadioButton=driver.findElement(By.name("b"));
		femaleRadioButton.click();
		
		WebElement submitButton=driver.findElement(By.className("button"));
		submitButton.click();
		
		
		WebElement googleLink=driver.findElement(By.tagName("a"));
		googleLink.click();
		
		if( driver.getTitle().contains("Google")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}

		driver.close();
	}

}
