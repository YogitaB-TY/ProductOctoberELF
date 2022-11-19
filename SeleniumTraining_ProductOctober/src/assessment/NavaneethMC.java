package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavaneethMC {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/");
		driver.findElement(By.xpath("//href[text()='moneycontrol.com']")).click();
		driver.findElement(By.xpath("//button[text()='Allow']")).click();
		WebElement text=driver.findElement(By.xpath("(//div[@id=\"in_maNSE\"]/descendant::td/b)[1]"));
		System.out.println(text.getText());
	}
}
