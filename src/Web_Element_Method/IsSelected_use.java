package Web_Element_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);

		WebElement CheckBox1 = driver.findElement(By.name("checkBoxOption1"));
		
		//CheckBox1.click();
		if(CheckBox1.isSelected())
		{
			System.out.println("CheckBox is already selected");
		}
	
		else
		{
			CheckBox1.click();
			System.out.println("CheckBox is now selected");
		}
	
	
	}

}
