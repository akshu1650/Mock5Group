package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	// 1. Data members/variables
	
	@FindBy (id="userid") private WebElement username;
	@FindBy (id="password") private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement loginbutton;
	
	// 2. Constructor
	
	public KiteLoginPage(WebDriver driver)// by passing datatype & paramter
	{
		PageFactory.initElements(driver, this);// to call global variable we need to use this keyword
	}										  // to find by in data member we need to create object
	
	//3. Methods
	
	public void sendusername()
	{
		username.sendKeys("ELR321");
	}

	public void sendpassword()
	{
		password.sendKeys("Dhana1111");
	}

	public void clickloginbutton()
	{
		loginbutton.click();
	}

}
