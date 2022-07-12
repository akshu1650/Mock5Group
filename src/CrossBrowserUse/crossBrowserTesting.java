package CrossBrowserUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTesting {
	// you can use paramter to run in XML file
	//step-3
	@Parameters("browsername") // by using keyword from XML we are reading browsername
	@Test
					//step-4
	public void test2(String name) throws InterruptedException { // browsername should be passed matching with name
		
		//step-7
		WebDriver driver = null;// we are declaring globally
		
		//step-5
		if(name.equals("firefox"))
		{
	  	
		// if iam giving paramtername as chrome then run in firefox
		//Step-1
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
	  	driver= new FirefoxDriver();// we are initializing this driver locally
		}
		//step-6
		else if (name.equals("chrome")) 
		{
		//step-2
	  	// if iam giving paramtername as chrome then run chrome	
	  	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		
	  	}
	
		//step-8
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		driver.close();
  
		// Now we read from XML browsername whether it is firefox or chrome 
  
  
  
  
  
  }
}
