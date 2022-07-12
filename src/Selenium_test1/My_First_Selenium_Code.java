package Selenium_test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_First_Selenium_Code {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
	
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi Akshay");
	
		
		
		
	}

}
