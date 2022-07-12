package ListenerTest;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerUse implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Screenshot taken please check the TC", true);
		Reporter.log("Failed TC name is"+result.getName(), true);
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC is Passed", true);
		Reporter.log("Success TC name is"+result.getName(), true);
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC is skipped please check the dependant method", true);
		Reporter.log("Skipped TC name is"+result.getName(), false);
	}

}
