package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragNDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions action=new Actions(driver);
		WebElement OsloSource=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement NorwayTarget=driver.findElement(By.xpath("//div[text()='Norway']"));
		
		//action.dragAndDrop(OsloSource, NorwayTarget).perform();
		action.moveToElement(OsloSource).clickAndHold().perform();
		action.release(NorwayTarget).perform();

	}

}
