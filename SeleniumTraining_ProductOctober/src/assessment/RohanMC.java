package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RohanMC {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/");
		
		
		driver.findElement(By.xpath("(//a[@href=\"https://www.moneycontrol.com/india/stockpricequote/refineries/relianceindustries/RI\"])[1]")).getText();
		driver.findElement(By.xpath("//div[@class='top_search_wrap']//input[@id='search_str']")).sendKeys("infy");
		driver.findElement(By.xpath("//div[@class='top_search_wrap']//a[@title=\'Submit\']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='inprice1 nsecp']")).getText());
		Thread.sleep(1000);
	}

}
