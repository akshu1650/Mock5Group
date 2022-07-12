package ActionsClass;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		System.out.println(driver.manage().window().getSize());
		
		//to set size, need to create object of class and pass width and height
		Dimension d=new Dimension(1111, 100);
		
		//using setsize method we can set size
		driver.manage().window().setSize(d);

	}

}
