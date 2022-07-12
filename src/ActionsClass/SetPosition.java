package ActionsClass;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	
		System.out.println(driver.manage().window().getPosition());
		
		// to setposition we need to create object of pointclass and pass x and y coordinate
		// point class = set positon
		
		Point p=new Point(200, 60);
		
		// using setposition we can set the browser position
		driver.manage().window().setPosition(p);
		
	
	
	
	
	}

}
