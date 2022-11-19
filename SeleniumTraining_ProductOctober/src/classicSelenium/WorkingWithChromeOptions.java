package classicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WorkingWithChromeOptions {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("start-maximized");
		//option.addArguments("incognito");
		//option.addArguments("headless");
		WebDriver driver=new ChromeDriver(option);
		//driver.manage().window().maximize();
		driver.get("https://www.justdial.com/Bangalore/Bakeries");
		System.out.println("Page loaded");
	}

}
