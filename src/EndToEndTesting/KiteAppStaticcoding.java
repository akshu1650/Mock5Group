package EndToEndTesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppStaticcoding {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);

		WebElement userID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userID.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		loginbutton.click();
		
		Thread.sleep(1000);
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		continuebutton.click();
		
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
		username.click();
		
		String ActualUID = username.getText();//for getting text we are writing this
		String ExpectedUID="ELR321";
		
		if(ActualUID.equals(ExpectedUID))
		{
			System.out.println("User ID is matching TC is Passed");
		}
		else
		{
			System.out.println("User ID is matching Test case is failed");
			
		}
		Thread.sleep(2000);
		
		WebElement ELR = driver.findElement(By.xpath("//span[@class='user-id']"));
		ELR.click();
		Thread.sleep(5000);
		
		WebElement as = driver.findElement(By.xpath("//a[@target='_self']"));// we are doing for only once click so no need to store ref variable
		as.click();
		Thread.sleep(3000);
		
		driver.close();
		
		// this method is called end to end testing
	 
	
	
	
	}

}
