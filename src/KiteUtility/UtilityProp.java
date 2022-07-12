package KiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp {

	public static String getDataFromPropertyFile(String key) throws IOException
	{
	Properties prop=new Properties();
	FileInputStream myFile= new FileInputStream("C:\\Users\\Anuj\\eclipse-workspace\\26th Mar-B Selenium\\test-output\\myProporties.Proporties");
	prop.load(myFile);
	String value = prop.getProperty(key);
	return value;
	}

	public static void captureScreenshot(WebDriver driver, String TCID) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Software testing notes\\8. Screenshots\\MyScreenshot"+TCID+".png");
		FileHandler.copy(scr, dest);
	}

}
