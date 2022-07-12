package TestNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationsStudy1 {
  @Test
  public void clickonpayment() 
  {
	  Reporter.log("train tickit payment is succesfull",true);
  }
  @BeforeMethod
  public void passengersdetails() 
  {
	  Reporter.log("fetching passenger details is succesful", true);
  }

  @AfterMethod
  public void bookedtraintickit() 
  {
	  Reporter.log("tickit is succesfuly booked",true); 
  }

  @BeforeClass
  public void loginIRCTC() 
  {
	  Reporter.log("loginButton is succesfull navigate to other class", true);
  }

  @AfterClass
  public void logOutAppIRCTC() 
  {
	  Reporter.log("logOut is done", true);
  }

}
