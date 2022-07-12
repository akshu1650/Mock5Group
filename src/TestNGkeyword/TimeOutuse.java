package TestNGkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutuse {
	 @Test(timeOut = 1000)
	  public void d() throws InterruptedException 
	  {
		 Thread.sleep(200); 
		 Reporter.log("d is running", true);
	  }

	  @Test
	  public void a() 
	  {
		  Reporter.log("a is running", true);
	  }

	  @Test
	  public void v() 
	  {
		  Reporter.log("v is running", true);
	  }
}
