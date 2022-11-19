package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement booksLink=driver.findElement(By.partialLinkText("BOOKS"));
		System.out.println(booksLink.getAttribute("href"));
		
		System.out.println(booksLink.getCssValue("color"));
		
		System.out.println(booksLink.getTagName());
		System.out.println(booksLink.getText());
		
		//booksLink.
	}

}
