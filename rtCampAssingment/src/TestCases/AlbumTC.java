package TestCases;

import org.testng.annotations.Test;

import PageObjects.Album;
import PageObjects.LoginActivity;

public class AlbumTC extends BaseClass {
	
	@Test
	public void media() throws Exception
	{
		LoginActivity log=new LoginActivity(driver);
		log.loginMethod("demo", "demo");
		Album al=new Album(driver);
		al.loginPg();
		al.albumUpload();
	}	
}
