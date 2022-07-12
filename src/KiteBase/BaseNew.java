package KiteBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import KiteUtility.UtilityProp;

public class BaseNew {

	protected WebDriver driver;
	public void openBrowserChrome() throws IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	
	// this chromeOptions you can not observe browser launch while ur doing another work
//	ChromeOptions opt=new ChromeOptions();
//	opt.addArguments("--disable notifications");
//	opt.addArguments("incognito");
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilityProp.getDataFromPropertyFile("URL"));
	Reporter.log("launching browser",true);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

	public void openBrowserFirefox() throws IOException 
	{
	System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(UtilityProp.getDataFromPropertyFile("URL"));
	Reporter.log("launching browser",true);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

	public static void captureScreenshot(WebDriver driver, String TCID) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Software testing notes\\8. Screenshots\\MyScreenshot"+TCID+".png");
		FileHandler.copy(scr, dest);
	}
	}
