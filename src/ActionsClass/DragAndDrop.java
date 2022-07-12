package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(2000);
		
		// find source and destination
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	
		WebElement destination = driver.findElement(By.id("shoppingCart4"));
	
		//how to drag and drop using Actions class
		//create object of Action class and pass driver object
		Actions Act=new Actions(driver);
		
		// by using Actions class method perform desired location
		//Act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
		
		Act.dragAndDrop(source, destination).perform();
	}

}
