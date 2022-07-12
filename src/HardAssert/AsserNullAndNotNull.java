package HardAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AsserNullAndNotNull {
  @Test
  public void Mymethod() {
 
	  String a= null;
	  String b= "abc";
	  
//	  Assert.assertNull(a,"value is not Null TC is failed");
//	  Reporter.log("value of a is null TC is passed",true);
 
		  
	  Assert.assertNotNull(b,"value is null TC is failed");
	  Reporter.log("value is not null TC is passed",true);
  
  }
}
