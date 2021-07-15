package TestCases;

import org.testng.annotations.Test;

import PageObjects.Album;
import PageObjects.LoginActivity;
import PageObjects.MediaLike;

public class MediaLikeTC extends BaseClass{
	
	@Test
	public void likes() throws Exception
	{
		LoginActivity log=new LoginActivity(driver);
		log.loginMethod("demo", "demo");
		Album al=new Album(driver);
		al.loginPg();
		MediaLike like=new MediaLike(driver);
		like.photoLike();
	}
}
   