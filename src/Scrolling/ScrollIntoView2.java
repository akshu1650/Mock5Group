package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement radio2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)",radio2);
		radio2.click();
		
		Thread.sleep(2000);
		WebElement suggestion = driver.findElement(By.id("autocomplete"));
		JavascriptExecutor jc=(JavascriptExecutor)driver;
		jc.executeScript("arguments[0].scrollIntoView(true)",suggestion);
		suggestion.sendKeys("Welcome");
		
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.id("name"));
		JavascriptExecutor jb=(JavascriptExecutor)driver;
		jb.executeScript("arguments[0].scrollIntoView(true)",name);
		name.sendKeys("Akshay Jagam");
	
	
	
	}

}
