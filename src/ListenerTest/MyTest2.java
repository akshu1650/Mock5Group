package ListenerTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ListenerTest.ListenerUse.class)
public class MyTest2 {
  @Test
  public void MyMethod3() 
  {
	  Reporter.log("Hi I am myMethod3", true);
  }

  @Test
  public void Mymethod4()
  {
	  Assert.fail();
	  Reporter.log("Hi I am myMethod5", true);
  }

  @Test(dependsOnMethods = {"Mymethod4"})
  public void Mymethod5()
  {
	  Reporter.log("Hi I am myMethod5", true);
  }
}
