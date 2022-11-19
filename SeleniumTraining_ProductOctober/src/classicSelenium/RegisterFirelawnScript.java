package classicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterFirelawnScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.firelawn.com/");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Meeeeeeghanaaaaaa");
		driver.findElement(By.id("lastName")).sendKeys("Choooowdaryyyyyy");
		driver.findElement(By.xpath("//input[@value='other']")).click();
		driver.findElement(By.id("phoneNumber")).sendKeys("9022485616");
		driver.findElement(By.id("email")).sendKeys("PleeeeaserunomRohaaaaaaan@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Towards!Rohan3");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Towards!Rohan3");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		WebElement interruption= driver.findElement(By.xpath("//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success']"));
		wait.until(ExpectedConditions.invisibilityOf(interruption));
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	
		
	}

}
