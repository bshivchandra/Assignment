package PageObjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateStatus {

	WebDriver driver;
	
	public UpdateStatus(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(name="whats-new")
	WebElement blanktext;
	
	@FindBy(className="rtm-upload-button-wrapper")       
	WebElement upload;
	
	@FindBy(name="wp-submit")
	WebElement loginbutton;
	
	@FindBy(name="aw-whats-new-submit")
	WebElement post;
	
		
	public void updateMethod() throws Exception
	{
		blanktext.sendKeys("New Tester");
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.click(upload).perform();
		
		Robot rb=new Robot();
		rb.delay(1000);
		StringSelection ss=new StringSelection("C:\\Users\\shiv\\Desktop\\download0.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
				
		act.click(post).perform();			
	}	
}
