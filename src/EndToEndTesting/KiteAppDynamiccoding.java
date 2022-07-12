package EndToEndTesting;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppDynamiccoding {

		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException  {
		
		File myfile=new File("C:\\Selenium\\ExcelSheet26thMar.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		String UN = mysheet.getRow(5).getCell(0).getStringCellValue();
		String PWD = mysheet.getRow(5).getCell(1).getStringCellValue();
		String PIN = mysheet.getRow(5).getCell(2).getStringCellValue();
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);

		WebElement userID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userID.sendKeys(UN);// UN is in already in string that why "" not given
		password.sendKeys(PWD);
		loginbutton.click();
		
		Thread.sleep(1000);
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys(PIN);
		continuebutton.click();
		
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
		username.click();
		
		String ActualUID = username.getText();//for getting text we are writing this
		String ExpectedUID=UN;				//	i hv to interest in checking content we are using .equal 
		
		if(ActualUID.equals(ExpectedUID))
		{
			System.out.println("User ID is matching TC is Passed");
		}
		else
		{
			System.out.println("User ID is matching Test case is failed");
			
		}
		username.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();// we are doing for only once click so no need to store ref variable
		Thread.sleep(3000);
		
		
		
		// this method is called end to end testing
	 
	
	
	
	}

}


		
	
	
	
	
	