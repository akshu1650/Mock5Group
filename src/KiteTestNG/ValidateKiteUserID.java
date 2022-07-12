 package KiteTestNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.Base;
import KitePOMnew.KiteHomePage;
import KitePOMnew.KiteLoginPage;
import KitePOMnew.KitePinPage;
import KiteUtility.Utility;

public class ValidateKiteUserID extends Base{
	
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	String TCID="1234";
	
	@BeforeClass
	public void launchBrowser()
	{
		openBrowser();
		home=new KiteHomePage(driver);
		login=new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendusername(Utility.readDataFromExcel(5, 0));
		login.sendpassword(Utility.readDataFromExcel(5, 1));
		login.clickloginbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(Utility.readDataFromExcel(5, 2));
		pin.clickcontinueButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	@Test
  public void ValidateUserID() throws EncryptedDocumentException, IOException {
		Assert.assertEquals(home.getActualUsername(), Utility.readDataFromExcel(5, 0),"Actual and Expected are not matching TC is failed");
  
		//Utility.captureScreenshot(driver, TCID);
	}

	@AfterMethod
	public void logOutToKiteApp() throws InterruptedException
	{
		home.clicklogoutButton();
	}

	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
