package classicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsTC {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		/*
		 * for (int i = 0; i <=links.size()-1; i++) {
		 * System.out.println(links.get(i).getText()); }
		 */
		
		for(WebElement link:links) {
			System.out.println(link.getText());
		}
	}

}
