package classicSelenium;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		System.out.println(driver.getWindowHandle());

		//CDwindow-5FD0C9A6E1338674174997460DF7BAA9
		//CDwindow-EA9A7EA4EDF9C0006A2C4A3814433B1D
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.findElement(By.partialLinkText("BOOKS")).click();
		/*
		 * driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		 * 
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		 */
		Set<String> windowHandles= driver.getWindowHandles();
		System.out.println(windowHandles);
		
		Set<Integer> set=new HashSet<Integer>();
		set.add(5);
		set.add(20);
		System.out.println(set);
	}

}
