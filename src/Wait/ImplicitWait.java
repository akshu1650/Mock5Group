package Wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(3000);//-->100ms-->1900ms

	
		//Implicit wait(Dynamic wait)
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.close();
	
	
	
	
	
	
	}

}
