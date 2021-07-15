package PageObjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Album {
	WebDriver driver;
	
	public Album(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}

	@FindBy(linkText="demo")
	WebElement loginpg;
	
	@FindBy(id="user-media")
	WebElement media;
	
	@FindBy(id="rtm_show_upload_ui")
	WebElement upload;
	
	@FindBy(name="album") //
	WebElement name;
	
	@FindBy(id="rtSelectPrivacy")
	WebElement privacy;
	
	@FindBy(id="rtMedia-upload-button")
	WebElement fileupload;


	public void loginPg()
	{
		loginpg.click();	
	}
	public void albumUpload() throws Exception
	{
		media.click();
        upload.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");

 		Actions act=new Actions(driver);
		act.moveToElement(name).click(name).perform();
		Select sel=new Select(name);
		sel.selectByValue("175");
		act.moveToElement(privacy).perform();
		Select sel2=new Select(privacy);
		sel2.selectByValue("60");
		
		act.moveToElement(fileupload).click().perform();
		
		Robot rb=new Robot();
		rb.delay(1000);
		StringSelection ss=new StringSelection("C:\\Users\\shiv\\Desktop\\rt_album");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
        rb.mouseMove(30,100);
        rb.mousePress(0);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);		
	} 
}
