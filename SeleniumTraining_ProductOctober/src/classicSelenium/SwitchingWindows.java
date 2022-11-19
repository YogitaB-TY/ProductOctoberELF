package classicSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {
	public static void main(String[] args) {

		//navigate to DWS, click on FB link, Click on forgotten account link in FB page

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String> windowHandles= driver.getWindowHandles();
		for(String handle:windowHandles) {
			driver.switchTo().window(handle);
			if(driver.getTitle().contains("Facebook")) {
				driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
			}
		}
	}

}
