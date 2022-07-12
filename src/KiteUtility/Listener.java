package KiteUtility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteBase.Base;
import KiteBase.BaseNew;

public class Listener extends BaseNew implements ITestListener {
	
	//WebDriver driver;
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Congradulations TC is PASSED,TC name is"+result.getName(), true);
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Sorry TC is failure, Failed TC name is"+result.getName(), true);
		
		String name = result.getName();
		try {
			UtilityProp.captureScreenshot(driver, name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
