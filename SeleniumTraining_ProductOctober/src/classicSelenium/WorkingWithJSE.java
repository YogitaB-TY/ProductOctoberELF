package classicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithJSE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.zomato.com/");
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,500);");
		//jse.executeScript("window.scrollTo(922,1573);");
		/*
		 * WebElement
		 * marathalli=driver.findElement(By.xpath("//h5[text()='Marathahalli']"));
		 * jse.executeScript("arguments[0].scrollIntoView(false);", marathalli);
		 */	}

}
