package testNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataDrivenTesting.DataDrivenTesting;
import dataDrivenTesting.DataMultipleRead;

public class LoginTestCase {
	
	@Test(dataProvider = "loginData")
	public void loginTest(String email, String pwd) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement account=driver.findElement(By.xpath("//a[text()='"+email+"']"));
		if(account.isDisplayed()) {
			System.out.println("PASS: User is successfully logged in");
		}else {
			System.out.println("FAIL: User is not logged in");
		}
		
		driver.quit();
	}
	
	@DataProvider(name="loginData",parallel = true)
	public Object[][] data() throws EncryptedDocumentException, IOException{
		
		/*
		 * File file=new File("./TestData/TestData.xlsx"); FileInputStream fis=new
		 * FileInputStream(file);
		 * 
		 * Workbook workbook=WorkbookFactory.create(fis); Sheet
		 * sheet=workbook.getSheet("Login"); Row row=sheet.getRow(0); Cell
		 * cell=row.getCell(0);
		 * 
		 * String value= cell.getStringCellValue(); Object data[][]=new Object[2][2];
		 * 
		 * return data;
		 */
		
		
		
		return DataMultipleRead.readMultiple("Login");
	}

}
