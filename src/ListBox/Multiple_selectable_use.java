package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_selectable_use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(1000);
	
		WebElement Multi_Selectable_use = driver.findElement(By.name("cars"));
	
		Select s=new Select(Multi_Selectable_use);
		
		System.out.println("multi selectable status is "+s.isMultiple());
	
		s.selectByVisibleText("Volvo");
		
		Thread.sleep(1000);
		
		s.selectByIndex(1);
		
		Thread.sleep(1000);
		
		s.selectByVisibleText("Opel");
		
		Thread.sleep(1000);
		
		s.selectByVisibleText("Audi");
	
		//s.deselectAll();
	
		s.deselectByIndex(3);
		Thread.sleep(1000);
		s.deselectByIndex(2);
		Thread.sleep(1000);
		s.deselectByIndex(1);
		
		System.out.println(s.getFirstSelectedOption().getText());	
	
		s.getAllSelectedOptions();
	
	}
	
}
