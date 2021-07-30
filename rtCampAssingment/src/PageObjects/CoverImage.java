package PageObjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverImage {
WebDriver driver;
	
	public  CoverImage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="user-xprofile")
	WebElement profbutton;
	
	@FindBy(id="change-cover-image")
	WebElement coverbutton;
	
	@FindBy(id="drag-drop-area")
	WebElement uploadframe;
	
	@FindBy(id="bp-browse-button")
	WebElement uploadbutton;
	
	@FindBy(id="bp-cover-image-feedback")
	WebElement uploadsuccess;
	
	
	
	public void image() throws Exception
	{
		profbutton.click();
		coverbutton.click();
		Actions act=new Actions(driver);
		act.moveToElement(uploadframe).build().perform();
		act.click(uploadbutton).perform();
		
		Robot rb=new Robot();
		rb.delay(1000);
		StringSelection ss=new StringSelection("C:\\Users\\shiv\\Desktop\\download8.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println(uploadsuccess.getText());		
	}
}
