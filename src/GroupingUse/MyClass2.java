package GroupingUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass2 {
	 @Test(groups = "regression")
	  public void p() 
	  {
		  Reporter.log("p is running regression", true);
	  }

	  @Test(groups = "sanity")
	  public void q() 
	  {
		  Reporter.log("q is running sanity", true);
	  }

	  @Test(groups = "regression")
	  public void r() 
	  {
		  Reporter.log("r is running regression", true);
	  }
  }

