 package KiteTestNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import KiteBase.Base;
import KitePOMnew.KiteHomePage;
import KitePOMnew.KiteLoginPage;
import KitePOMnew.KitePinPage;
import KiteUtility.Utility;
import KiteUtility.UtilityProp;

@Listeners(KiteUtility.Listener.class)
public class ValidateKiteUserIDUsingProp extends Base{
	
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	//String TCID="5555";
	@Parameters("browserName")
	@BeforeClass
	public void launchBrowser(@Optional String name)
	{
		if(name.equals("chrome"))
		{
			openBrowser();
		}
		else if(name.equals("Firefox"))
		{
			openBrowser();
		}
		home=new KiteHomePage(driver);
		login=new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendusername(UtilityProp.getDataFromPropertyFile("UN"));
		login.sendpassword(UtilityProp.getDataFromPropertyFile("PWD"));
		login.clickloginbutton();
		
		pin.sendPin(UtilityProp.getDataFromPropertyFile("PIN"));
		pin.clickcontinueButton();
		
	}
	
	@Test
	public void ValidateUserID() throws EncryptedDocumentException, IOException {
		
		Assert.assertEquals(home.getActualUsername(), UtilityProp.getDataFromPropertyFile("UN"));
		Assert.fail();
		
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
