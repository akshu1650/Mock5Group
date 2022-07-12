package HardAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertEqualsnotEqualsUse {
  @Test
  public void Mymethod() 
  {
	  //AssertEquals
	 
	  
	  String a= "Pune";
	  String b= "Pune";
	  
	  Assert.assertEquals(a, b,"a and b are not matching so TC is failed");
	  Reporter.log("a and b is matching so TC is passed",true);
  }
	  
  
  @Test
  public void Mymethod2() 
  {
	  //AssertEquals
	 
	
	  String expectedResult= "Pune";
	  String actualResult= "Akshay";
	  
	  Assert.assertEquals(actualResult,expectedResult,"Result is not matching");
	  Reporter.log("Mymethod2 is running",true);
  }
  
  
  //AsserNotEquals
	  @Test
	  public void Mymethod1() 
	  {
	  
	  
	  String c= "Pune";
	  String d= "Parbhani";
	  
	  Assert.assertNotEquals(c, d,"c and d is matching so TC is passed");
	  Reporter.log("c and d is not matching so TC is failed",true);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }
}
