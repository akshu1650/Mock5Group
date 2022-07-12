package KitePOMusingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
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

		KiteLoginPage login=new KiteLoginPage(driver);// constructor called by using paramter
		login.sendusername(UN);
		login.sendpassword(PWD);
		login.clickloginbutton();
		
		Thread.sleep(2000);
	
		KitePinPage Pin=new KitePinPage(driver);
		Pin.sendPin(PIN);
		Pin.clickcontinueButton();
		
		Thread.sleep(2000);
		
		KiteHomePage home=new KiteHomePage(driver);
		home.validateusername(UN);
		home.clicklogoutButton();
		
		driver.close();
		
	
	
	
	
	
	
	}

}
