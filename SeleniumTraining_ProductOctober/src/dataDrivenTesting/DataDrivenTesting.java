package dataDrivenTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	
	@Test(dataProvider = "testData")
	public void loginScript(String email,String pwd) {
		System.out.println(email);
		System.out.println(pwd);
	}
	
	@DataProvider(name = "testData")
	public Object[][] testData() throws EncryptedDocumentException, IOException {
		
				/*
		 * data[0][0]="yogita.b@testyantra.com"; data[0][1]="Password";
		 * data[1][0]="sanu.s@testyantra.com"; data[1][1]="Password@123";
		 */		
		return DataMultipleRead.readMultiple("Login");
		
		
		
	}

}
