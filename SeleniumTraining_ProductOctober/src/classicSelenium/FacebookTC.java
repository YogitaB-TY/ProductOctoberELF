package classicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTC {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement createAccountLink=driver.findElement(By.partialLinkText("Create New Account"));
		createAccountLink.click();
		
		//Thread.sleep(3000);
		WebElement firstName=driver.findElement(By.name("firstname"));
		firstName.sendKeys("yogita");
		
		WebElement lastName=driver.findElement(By.name("lastname"));
		lastName.sendKeys("1234");
				
				
		WebElement emailTF=driver.findElement(By.name("reg_email__"));
		emailTF.sendKeys("yogita@gmail.com");
		
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("12344566");
		
	}

}
