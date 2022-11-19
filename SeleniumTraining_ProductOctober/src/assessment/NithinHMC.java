package assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NithinHMC {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/");
		
		WebElement moneyControlLink=driver.findElement(By.xpath("//a[text()='moneycontrol.com']"));
		moneyControlLink.click();
		
		
	    WebElement stockVAlue=driver.findElement(By.xpath("(//div[@class=\"PR in_ma_display_data\"]//td[@class=\"grntxt\"])[2]"));
		String  searchOutput=stockVAlue.getAttribute("value");
		
	
	    WebElement searchTf=driver.findElement(By.xpath("(//input[@class='txtsrchbox FL'])[1]"));
	    searchTf.sendKeys("Infy");
	    
	    WebElement searchButton=driver.findElement(By.xpath("(//a[@class='top_search_btn'])[1]"));
	    searchButton.click();
	    
	    WebElement infosysValue=driver.findElement(By.xpath("//div[@class='inprice1 nsecp']"));
	    String searchOutput1=infosysValue.getAttribute("value1");
	    driver.close();
	}
	

}
