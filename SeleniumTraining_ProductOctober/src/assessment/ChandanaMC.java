package assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChandanaMC {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.moneycontrol.com/");
		driver.findElement(By.xpath("(//input[@id=\"search_str\"])[1]")).sendKeys("infy");
		driver.findElement(By.xpath("(//a[@class=\"top_search_btn\"])[1]")).click();
	
	}

}
