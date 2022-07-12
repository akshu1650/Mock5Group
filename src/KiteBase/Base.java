package KiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {
	protected WebDriver driver;
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		// this chromeOptions you can not observe browser launch while ur doing another work
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--disable notifications");
//		opt.addArguments("incognito");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("launching browser",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
	}

	


}