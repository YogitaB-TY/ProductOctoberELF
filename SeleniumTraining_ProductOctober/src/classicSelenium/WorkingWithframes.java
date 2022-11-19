package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithframes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/User/Downloads/iframe.html");
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//a[text()='INDIA']")).click();

		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
	}

}
