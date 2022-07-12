package Web_Driver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		//this is the key			//path		// file name
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

WebDriver driver= new ChromeDriver();// creating object of chrome driver because memory location which we are getting chromedriver
								// object callled instance variable because you create instance of chromedriver class 
//1. driver.get("https://vctcpune.com/");

//2. driver.close();

//3. driver.quit();		

driver.manage().window().maximize();

//4. driver.manage().window().minimize();

//5. driver.navigate().to("https://www.facebook.com/");
//
//driver.navigate().back();
//
//driver.navigate().forward();
//
//driver.navigate().refresh();
//
//6. System.out.println(driver.getTitle());
//
//String title = driver.getTitle();
//
//System.out.println(title);
//
//7. System.out.println(driver.getCurrentUrl());

	}

}
