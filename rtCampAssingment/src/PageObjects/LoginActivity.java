package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginActivity {
	WebDriver driver;
	
	public LoginActivity(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(name="log")
	WebElement username;
	
	@FindBy(name="pwd")      
	WebElement password;
	
	@FindBy(name="wp-submit")
	WebElement loginbutton;
	
	public void loginMethod(String username2,String password2) throws Exception
	{
		username.sendKeys(username2);
		password.sendKeys(password2);
		loginbutton.click();				
	}	    	
}
