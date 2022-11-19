package classicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		
		 driver.get("https://demowebshop.tricentis.com/");
		
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle());
		 
		 driver.get("https://demo.actitime.com/login.do");
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 //driver.navigate().to("https://www.flinko.com/");
		
		 System.out.println(driver.getPageSource());
		 
		 driver.quit();
	}

}
