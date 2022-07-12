package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		Thread.sleep(2000);
		

		String text = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
	
		System.out.println(text);
		
		driver.switchTo().frame("frame1");
	
		driver.findElement(By.xpath("//input[1]")).sendKeys("Hi Akshay");
		
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().frame("frame2");
		
		WebElement animals = driver.findElement(By.id("animals"));
		
		Thread.sleep(2000);
		
		Select s=new Select(animals);
		
		s.selectByVisibleText("Big Baby Cat");
	
	
	
	}

}
