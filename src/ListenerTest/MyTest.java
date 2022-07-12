package ListenerTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.ListenerUse.class)
public class MyTest {
  @Test
  public void MyMethod() 
  {
	  Reporter.log("Hi I am myMethod", true);
  }

  @Test
  public void Mymethod1()
  {
	  Assert.fail();
	  Reporter.log("Hi I am myMethod1", true);
  }

  @Test(dependsOnMethods = {"Mymethod1"})
  public void Mymethod2()
  {
	  Reporter.log("Hi I am myMethod2", true);
  }
}
