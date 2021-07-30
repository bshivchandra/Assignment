package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginActivity;

public class LoginTC extends BaseClass  {	
	
	@Test 
	public void loginTest() throws Exception
	{
		LoginActivity log=new LoginActivity(driver);
		log.loginMethod("demo","demo");
		System.out.println(driver.getTitle());
		//Log In ‹ rtCamp — WordPress
		
		if(driver.getTitle().equals("Activity – rtCamp"))
	      {
	    	  Assert.assertTrue(true);
	      }
	      else
	      {	
	    	  Assert.assertTrue(false);
	      }
	}
			
}


	
