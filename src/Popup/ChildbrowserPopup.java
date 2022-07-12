package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildbrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(1000);

		String mainPageID = driver.getWindowHandle();
		System.out.println(mainPageID);
		System.out.println("========================");
	
		// to open child window
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		// to handle multiple window / to get multiple ID
		
		Set<String> allpageID = driver.getWindowHandles();
		Iterator<String> it = allpageID.iterator();
//		while (it.hasNext()) // we are doing this for printing ID in console window
//		{
//		System.out.println(it.next());	
//		}
		
		String MainPageID1=it.next();// will return main page ID
		String childpageID = it.next(); // will return child page ID
	
		// to switch focus to child window
	
		driver.switchTo().window(childpageID);// changing focus from main page to child page
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("selenium");
		//driver.close(); will close only current focus tab
		//driver.quit();// will closed all tab /pages open in selenium
		Thread.sleep(1000);
		driver.switchTo().window(mainPageID);
		WebElement myelement = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		{
			System.out.println(myelement.getText());
		}
 
	}
}