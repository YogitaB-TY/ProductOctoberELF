package classicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingEmptyBrowser {
	
	public static void main(String[] args) {
		
		//mentioning which browser to launch
		//syntax== webdriver.browsername.driver
		String key="webdriver.chrome.driver";
		
		// path of the browser driver
		String value="./Drivers/chromedriver.exe";
		
		//V V important to launch browser
		System.setProperty(key, value);
		
		
		//launching browser code:
		ChromeDriver driver=new ChromeDriver();
	}

}
