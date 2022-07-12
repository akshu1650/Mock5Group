package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);

		KiteLoginPage login=new KiteLoginPage(driver);// constructor called by using paramter
		login.sendusername();
		login.sendpassword();
		login.clickloginbutton();
		
		Thread.sleep(2000);
	
		KitePinPage Pin=new KitePinPage(driver);
		Pin.sendPin();
		Pin.clickcontinueButton();
		
		Thread.sleep(2000);
		
		KiteHomePage home=new KiteHomePage(driver);
		home.validateusername();
		home.clicklogoutButton();
		
		driver.close();
		
	
	
	
	
	
	
	}

}
