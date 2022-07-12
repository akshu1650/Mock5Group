package HardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerificationUse {
  @Test
  public void Mymethod() {
 
	  String a= "Pune";
	  String b= "Pune";
	  
	 
	//assert.assertNotNull(b,"value of a is not null TC is passed");
	  
	  Assert.assertNotEquals(a, b,"a,b TC is passed value are equal");
	  Assert.assertNotNull(b,"value of b is null Tc is failed");
  }
}
// we cannot achieve multiple verifiaction point if TC is failed it will not proceed