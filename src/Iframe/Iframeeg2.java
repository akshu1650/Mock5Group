package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeeg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/iframes/");
		
		Thread.sleep(2000);

		//step-1
		String text = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
	
		System.out.println(text);
	
		//step-3
		
		//driver.switchTo().frame("Frame1");// changing focus from main page to frame
		
		driver.switchTo().frame(0);
		
		//step-2
		String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		
		System.out.println(text1);
	
		//xpath by link text step-4
		
		//step-5
		
		driver.switchTo().parentFrame(); // changing focus from frame to main page
		
		String text2 = driver.findElement(By.linkText("Pavilion")).getText();
	
		System.out.println(text2);
	 
	
	}

}
