package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithRightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action=new Actions(driver);
		//action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).build().perform();
		WebElement rightClickElement=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//action.moveToElement(rightClickElement).contextClick().perform();
		
		WebElement doubleClickElement=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.moveToElement(doubleClickElement).doubleClick().perform();

		//driver.close();
	}

}
