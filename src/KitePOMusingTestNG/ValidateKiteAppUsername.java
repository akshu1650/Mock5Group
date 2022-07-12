package KitePOMusingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAppUsername {
  
	//step-3
	WebDriver driver;// declaring driver globally
	//step-4
	Sheet mysheet;//declaring driver globally
	//step-6
	KiteLoginPage login;// we have to create object of each page globally so declaration part is done here
	//step-7
	KiteHomePage home;
	//step-8
	KitePinPage pin;
	@BeforeClass
	public void browseLaunch() throws EncryptedDocumentException, IOException
	{
		//step-1 launching browser
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		// this chromeOptions you can not observe browser launch while ur doing another work
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("..headless");
		//opt.addArguments("--disable notifications");
		opt.addArguments("incognito");
		
		driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("launching browser",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
	
		//step-2
		File myfile=new File("C:\\Selenium\\ExcelSheet26thMar.xlsx");
		mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		//step-9 objects to be initialize
		login=new KiteLoginPage(driver);
		home=new KiteHomePage(driver);
		pin=new KitePinPage(driver);
		
	}
	@BeforeMethod
	public void loginToKiteApp()
	{
		//step-5
		String UN = mysheet.getRow(5).getCell(0).getStringCellValue();
		String PWD = mysheet.getRow(5).getCell(1).getStringCellValue();
		String PIN = mysheet.getRow(5).getCell(2).getStringCellValue();
		
		//step-10 object creation
		login.sendusername(UN);
		Reporter.log("sending Username",true);
		login.sendpassword(PWD);
		Reporter.log("sending Password",true);
		login.clickloginbutton();
		Reporter.log("clicking login",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
		
		pin.sendPin(PIN);
		Reporter.log("sending PIN",true);
		pin.clickcontinueButton();
		Reporter.log("clicking continue button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
		
	}
	
	@Test
	public void ValidateUsrName() 
	{
		//step-11
		String expectedUN = mysheet.getRow(5).getCell(0).getStringCellValue();
		String actualUN = home.getActualUsername();
		Reporter.log("Validate Username",true);
		
		Assert.assertEquals(actualUN, expectedUN,"actualUN, expectedUN is not matching TC is failed");
		Reporter.log("actual and expected UN are matching TC is passed",true);
	}

//	@AfterMethod
//	public void logOutFromKiteApp() throws InterruptedException
//	{
//		//step-12
//		home.clicklogoutButton();
//		Reporter.log("logging Out",true);
//	}
//
//	@AfterClass
//	public void closeBrowser() throws InterruptedException
//	{
//		Thread.sleep(2000);
//		driver.close();
//		Reporter.log("closing browser",true);
//	}


}
