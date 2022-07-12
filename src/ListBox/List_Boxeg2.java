package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Boxeg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(10000);
		
		WebElement listbox = driver.findElement(By.name("Date of Birth"));
		
		Select s= new Select(listbox);
		
		s.selectByIndex(13);
		
		Thread.sleep(1000);
		
		s.selectByVisibleText("Jun");
		
		Thread.sleep(1000);
		
		s.selectByValue("1992");
	
		System.out.println("multi selectable is "+s.isMultiple() );
	}

}
