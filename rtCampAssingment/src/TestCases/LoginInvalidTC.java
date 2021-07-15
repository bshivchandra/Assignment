package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginActivity;

public class LoginInvalidTC extends BaseClass 
{
	
	@Test
	public void invalidLogin() throws Exception
	{
		
		LoginActivity log=new LoginActivity(driver);
		log.loginMethod("Demo","Demo");
		System.out.println(driver.findElement(By.id("login_error")).getText());
		
		if(driver.getTitle().equals("Log In ‹ rtCamp — WordPress"))
	      {
	    	  Assert.assertTrue(true);
	      }
	      else
	      {	
	    	  Assert.assertTrue(false);
	      }
	}
}
