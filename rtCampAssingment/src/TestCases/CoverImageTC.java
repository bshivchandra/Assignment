package TestCases;

import org.testng.annotations.Test;

import PageObjects.Album;
import PageObjects.CoverImage;
import PageObjects.LoginActivity;

public class CoverImageTC extends BaseClass {
	
	@Test
	public void image() throws Exception
	{
		LoginActivity log=new LoginActivity(driver);
		log.loginMethod("demo", "demo");
		Album al=new Album(driver);
		al.loginPg();
		CoverImage cover=new CoverImage(driver);
		cover.image();
	}
}
