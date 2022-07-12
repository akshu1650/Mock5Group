package GroupingUse;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass1 {
 
  
	  @Test
	  public void a() 
	  {
		  Assert.fail();
		  Reporter.log("a is running", true);
	  }

	  @Test(groups = "sanity")
	  public void b() 
	  {
		  Reporter.log("b is running sanity", true);
	  }

	  @Test(groups = "regression")
	  public void c() 
	  {
		  Reporter.log("c is running regression", true);
	  }
  
}
