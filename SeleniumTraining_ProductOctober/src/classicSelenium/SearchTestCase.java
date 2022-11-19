package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String searchValue="Laptops";
		WebElement searchTF=driver.findElement(By.id("small-searchterms"));
		searchTF.sendKeys(searchValue);
		
		WebElement searchButton=driver.findElement(By.xpath("//input[@value='Search']"));
		searchButton.submit();
		
		WebElement searchKeyword=driver.findElement(By.id("Q"));
		String searchOutput= searchKeyword.getAttribute("value");
		if(searchOutput.contains(searchValue)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}

}
