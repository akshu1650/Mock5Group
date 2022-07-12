
package SoftAssertUse;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertEqualsAndNotEquals {
  @Test
  public void Test1() {
  
//	  String a="abc";
//	  String b="abc";
	  String expected="Akshay";
	  String Actual="Pune";
//	  int a=20;
//	  int b=20;
	  
	  SoftAssert soft=new SoftAssert();// creating object if softassertclass
	  
	  // objectname.methodname
	  soft.assertEquals(expected,Actual,"expected,actual is not matching TC is failed");
	  Reporter.log("Test1 is running",true);
//	  
	  soft.assertNotEquals(expected, Actual,"expected,actual is not matching TC is passed");
	  Reporter.log("Test1 is not running",true);
//	  
//	  soft.assertNotNull(expected,"value of expected is not Null ");
//	  Reporter.log("value of expected is passed");
	  
//	  soft.assertNotEquals(a, b,"a,b value is matching TC is failed");
//	  Reporter.log("Value is not matching");
//	  
//	  soft.assertNull(b,"value of b is matching TC is failed");
	  
	  soft.assertAll();
	  
	
  
  
  
  
  
  
  }
}
