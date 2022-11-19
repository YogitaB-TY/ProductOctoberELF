package assessment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChandanaMyntra {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");

		WebElement men=driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(men).perform();
		driver.findElement(By.xpath("(//a[text()='Sweaters'])")).click();

		driver.findElement(By.xpath("//img[@title=\"Roadster Blue Sweater\"]")).click();
		String parent=driver.getWindowHandle();
		Set<String> childwin=driver.getWindowHandles();
		for(String i:childwin) {
			if(i!=parent) {
				driver.switchTo().window(i);
			}
		}
		driver.findElement(By.xpath("(//p[@class=\"size-buttons-unified-size\"])[2]")).click();
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();

		driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='PLACE ORDER']")).click();
		String a=driver.getCurrentUrl();
		System.out.println(a);
	}

}
