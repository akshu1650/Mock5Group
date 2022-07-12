package ActionsClass;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");

		Thread.sleep(2000);
	
		WebElement textbox = driver.findElement(By.id("autocomplete"));
		
		// textbox.sendkeys("Welcome back"); using webelement method
		
		// how to sendkeys using Actions class
		//create object of Actions class and pass driver object
		
		Actions Act=new Actions(driver);
		
		//using sendkeys method of Actions class perfrom sendkeys task
		Act.sendKeys(textbox, "Welcome back").perform();
		Thread.sleep(500);
		// how to handle dropdown using Actions classe
		
		WebElement dropdownclass = driver.findElement(By.name("dropdown-class-example"));
		
		Act.click(dropdownclass).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
	
	
	
	
	}

}
