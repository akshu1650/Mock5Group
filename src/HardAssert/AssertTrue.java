package HardAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void Mymethod1() {
  
	  //assertTrue
	  boolean a= true;
	  boolean b= false;
	  
//	  Assert.assertTrue(a, "a is false TC is failed");
//	  Reporter.log("a is true TC is passed",true);
//  
//	  Assert.assertTrue(b, "b is false TC is failed");
//	  Reporter.log("b is true TC is passed",true);
  
	  Assert.assertFalse(a, "a is True TC is failed");
	  Reporter.log("value of a is true TC is passesd",true);
  
  }
}
