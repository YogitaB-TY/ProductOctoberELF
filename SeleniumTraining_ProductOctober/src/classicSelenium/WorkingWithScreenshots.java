package classicSelenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WorkingWithScreenshots {
	public static void main(String[] args) throws IOException {
		LocalDateTime dateTime=LocalDateTime.now();
		String screenshotName=dateTime.toString().replaceAll(":", "-");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement element=driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		File temp= element.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+screenshotName+".png");
		FileHandler.copy(temp, dest);
		
	}

}
