package TestCases;

import org.testng.annotations.Test;

import PageObjects.LoginActivity;
import PageObjects.UpdateStatus;

public class UpdateStatusTC extends BaseClass{
	
	@Test
	public void update() throws Exception
	{
		LoginActivity log=new LoginActivity(driver);
		log.loginMethod("demo", "demo");
		UpdateStatus up=new UpdateStatus(driver);
		up.updateMethod();
	}
}
