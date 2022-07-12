package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollintoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");


		Thread.sleep(2000);

		WebElement Readmore = driver.findElement(By.xpath("(//a[@class='et_pb_button et_pb_promo_button'])[2]"));
	
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		j.executeScript("arguments[0].scrollIntoView(true)",Readmore);
	
	
	
	
	
	}

}
