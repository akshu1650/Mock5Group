package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {


	@FindBy(xpath = "//span[@class='user-id']") private WebElement username;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;

	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void validateusername()
	{
		String expecteduserID = "ELR321";
		String actualUId = username.getText();
	
	if(expecteduserID.equals(actualUId))
	{
		System.out.println("Actual and expecteduserID are matching TC is passed");
	}
	else 
	{
		System.out.println("Actual and expecteduserID are not matching TC is failed");
		System.out.println("Akshay");
	}
	
	}
	
	public void clicklogoutButton() throws InterruptedException
	{
		username.click();
		Thread.sleep(200);
		logoutButton.click();
		
		
	
	
	}


}
