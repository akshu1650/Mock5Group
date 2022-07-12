package Web_Element_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
	
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		WebElement show = driver.findElement(By.id("show-textbox"));
		WebElement textbox = driver.findElement(By.name("show-hide"));
	
		if(textbox.isDisplayed())
		{
			System.out.println("thankyou textbox is a displayed");
		}
			
		else
		{
			System.out.println("cant find textbox");
		}
	
		hide.click();
		
		if(textbox.isDisplayed())
		{
			System.out.println("thankyou textbox is a displayed");
		}
			
		else
		{
			System.out.println("cant find textbox");
		}
	
		show.click();
		
		 if(textbox.isDisplayed())
		{
			System.out.println("thankyou textbox is a displayed");
		}
			
		else
		{
			System.out.println("cant find textbox");
		}
	}
	

}
