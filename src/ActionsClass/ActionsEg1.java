package ActionsClass;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Popup.AlertPopup;

public class ActionsEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(2000);
		
		WebElement selenium = driver.findElement(By.linkText("Selenium"));
		//seleniumbutton.click(); // we are using this method by webelement method
		
		//create object of Actions class and pass driver object
		Actions Act=new Actions(driver);
		
		// using one of the required actions complete the process
		
//		Act.moveToElement(seleniumbutton).perform();// 1st method and single method using only
//													//.perform
//		Act.click().perform();
//		
//		Act.moveToElement(seleniumbutton).click().build().perform();// 2nd way of method
		// build means binding 
		// this method also called as cascading method means various types of method come
		//in one syntax ex= driver.manage.window.maximize;
		// for multiple method we are using this
		
		//Act.click(seleniumbutton).perform();
		
		// H.W for right click button
		
		WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		//Act.moveToElement(rightclickbutton).contextClick().build().perform();
		Act.click(rightclickbutton).perform();
		
		
		//how to double click using Actions class
		
		WebElement doubleclickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	
		//Act.moveToElement(doubleclickbutton).doubleClick().build().perform();
		
		Act.doubleClick(doubleclickbutton).perform();
	
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(1000);
		alt.dismiss();
	}

}
