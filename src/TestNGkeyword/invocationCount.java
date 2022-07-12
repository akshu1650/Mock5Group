package TestNGkeyword;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invocationCount {
  @Test(invocationCount = 3)
 
  public void Boy() 
  {
	  Reporter.log("Hey hiee", true);
  }

  @BeforeMethod
  public void girl()
  {
	  Reporter.log("Hiee", true);
  }

  @AfterMethod
  public void friend()
  {
	  Reporter.log("Hello", true);
  }



}
