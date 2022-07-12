package Miscelleneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);

		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(200);
	
		List<WebElement> searchresults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		System.out.println(searchresults.size());
		
		// for each loop
		
		for(WebElement b:searchresults)// for getting text
		{
			System.out.println(b.getText()); // for getting text
		}
			
		for(WebElement result:searchresults)// for clicking on required results
		{
			String actualText = result.getText();
			String expectedText = "honda amaze";
		
		if(actualText.equals(expectedText))
			{
				result.click();
				break;
			} 
		
		}
	
		driver.findElement(By.linkText("images")).click();
	
		// practice once again on images is not clicking
	}

}
