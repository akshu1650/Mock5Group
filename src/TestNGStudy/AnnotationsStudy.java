package TestNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationsStudy {
  @Test
  public void validateuserID()
  {
	  Reporter.log("user is able to validate userID",true);
  }
  
  @Test
  public void validateuserPIN()
  {
	  Reporter.log("user is able to validateuserPIN", true);
  }
  @BeforeMethod// this method run two times because we hv taken method two times and class anotations delare only 1 time beacuse we taken class 1 time
  public void EnterIDandPWD() 
  {
	  Reporter.log("user is able Enter ID and PWD ",true);
  }

  @AfterMethod
  public void logintoWebPage() 
  {
	  Reporter.log("Successfulogin to MainPage", true);
  }

  @BeforeClass
  public void launchbrowser() 
  {
	  Reporter.log("user is able to launch browsersucessfull", true);
  }

  @AfterClass
  public void closebrowser() 
  {
	  Reporter.log("user is able to close the browser", true);
  }

}
