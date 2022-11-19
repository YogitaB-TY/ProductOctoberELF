package classicSelenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		
		action.keyDown(Keys.ARROW_DOWN).perform();
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		action.keyUp(Keys.SHIFT).perform();
		
		/*
		 * action.sendKeys(Keys.PAGE_DOWN).perform(); Thread.sleep(3000);
		 * action.sendKeys(Keys.PAGE_DOWN).perform(); Thread.sleep(3000);
		 * action.sendKeys(Keys.PAGE_UP).perform();
		 */
		
	}

}
