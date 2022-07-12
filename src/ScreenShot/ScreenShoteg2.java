package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;


public class ScreenShoteg2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/movies");
		
		Thread.sleep(1000);

		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String str=RandomString.make(4);// we have avoiding overide screenshot
		
		File Destination = new File("D:\\Software testing notes\\8. Screenshots\\Takescreenshot"+str+".png");
		
		FileHandler.copy(source, Destination);
	
	
	
	} 

}
