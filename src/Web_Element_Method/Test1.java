package Web_Element_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung");

		driver.manage().window().maximize();
		//1. sendkeys
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("akshay jagam");
		
		Thread.sleep(1000); // we trying to synchronize (matching)selenium speed & browser speed
		
		//2. clear
		//driver.findElement(By.xpath("//input[@type='text']")).clear();
		
		//3. click
		
		//driver.findElement(By.xpath("//input[@value='Radio3']")).click();
	
		//4. gettext
		
		//1.
		
		System.out.println(driver.findElement(By.xpath("//h2[text()='Latest Samsung mobiles']")).getText());
	
		//2.
		
		String text = driver.findElement(By.xpath("//h2[text()='Latest Samsung mobiles ']")).getText();
		System.out.println(text);
		
		//3.
		
		WebElement element = driver.findElement(By.xpath("//h2[text()='Latest Samsung mobiles ']"));
		System.out.println(element.getText());
	
	
	
	
	
	
	

	}

}
