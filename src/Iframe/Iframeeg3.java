package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeeg3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
		System.out.println(text);
		
		driver.switchTo().frame("frame2");
		
		String text1 = driver.findElement(By.id("animals")).getText();
		System.out.println(text1);
		
		driver.switchTo().parentFrame();
	
		String text2 = driver.findElement(By.id("//iframe[@id='frame3']")).getText();
	
		System.out.println(text2);
	
	
	}

}
