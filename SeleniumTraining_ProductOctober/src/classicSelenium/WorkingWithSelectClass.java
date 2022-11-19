package classicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSelectClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		/*
		 * driver.get(
		 * "C:/Users/User/Documents/Selenium/HTML-Pages/MultipleDropdown.html");
		 * 
		 * WebElement dropdown= driver.findElement(By.name("menu"));
		 * 
		 * Select select=new Select(dropdown);
		 * 
		 * if(select.isMultiple()) { select.selectByVisibleText("Soup");
		 * select.selectByVisibleText("Burger"); select.selectByVisibleText("Pizza");
		 * select.deselectAll(); }
		 * 
		 * 
		 * Boolean flag= select.isMultiple(); System.out.println(flag);
		 */
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("BOOKS")).click();
		WebElement dropdown=driver.findElement(By.id("products-orderby"));
		
		Select select=new Select(dropdown);
		
		Boolean flag= select.isMultiple();
		System.out.println(flag);
		
		/*
		 * driver.get("https://www.myntra.com/");
		 * 
		 * 
		 * driver.get("https://demowebshop.tricentis.com/");
		 * 
		 * driver.findElement(By.partialLinkText("BOOKS")).click();
		 * 
		 * 
		 * 
		 * //address of the drop down Select select=new Select(sortByDropDown);
		 * select.selectByVisibleText("Name: Z to A");
		 * 
		 * 
		 * WebElement sortByDropDown=driver.findElement(By.id("products-orderby"));
		 * Select select1=new Select(sortByDropDown);
		 * 
		 * List<WebElement> sortByoptions= select1.getOptions();
		 * 
		 * for(int i=0;i<=sortByoptions.size()-1;i++) { WebElement
		 * sortByDropDown1=driver.findElement(By.id("products-orderby")); Select
		 * select=new Select(sortByDropDown1); select.selectByIndex(i); }
		 * 
		 * List<WebElement> dropDownOptions= select.getOptions(); for(WebElement
		 * option:dropDownOptions) { System.out.println(option.getText()); }
		 * 
		 * 
		 * driver.findElement(By.
		 * xpath("//input[@placeholder='Search for products, brands and more']")).
		 * sendKeys("tshirt"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//li[text()='Tshirt Polo']")).click();
		 */
		
		
	}

}
