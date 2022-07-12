package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

	public class MyTestClass {
	@Test						// Means method or test case
  								// by default when u r creating testclass one method compulsory come ie. test
  								// In every TestNG class we are not creating main mainmethod
	
		public void Mymethod() throws InterruptedException {
  
	  	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("Hie this method running outputfile");
		Reporter.log("Hi this method is ruuning output file true");
		Reporter.log("Hi this method is ruuning output file", true);
		Thread.sleep(2000);
	}
		

		@Test						// Means method or test case
									// by default when u r creating testclass one method compulsory come ie. test
									// In every TestNG class we are not creating main mainmethod

		public void Mymethod1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		Thread.sleep(2000);
  
  
  
  
  
  
  }
}
