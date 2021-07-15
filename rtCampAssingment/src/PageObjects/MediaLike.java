package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MediaLike {
		WebDriver driver;
		
		public MediaLike(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}

		@FindBy(id="1619")
		WebElement id;

		@FindBy(id="rtmedia-single-media-container")
		WebElement photo;
		 
		@FindBy(id="user-media")
		WebElement media;
		
		
		public void photoLike() throws Exception
		{
			media.click();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			Actions act=new Actions(driver);
			act.click(id).perform();
			act.moveToElement(photo).build().perform();
			WebElement likebutton1=driver.findElement(By.xpath("//*[@id=\"rtmedia-single-media-container\"]//div[2]//div[2]//form[4]//button//span"));
			act.click(likebutton1).perform();
			System.out.println(likebutton1.getText());
			WebElement likebutton2=driver.findElement(By.xpath("//*[@id=\"buddypress\"]//div//div//div[2]//div//div//div[4]//div[1]//div//span//form//button//span"));
			act.moveToElement(likebutton2).build().perform();
			System.out.println(likebutton2.getText());
		}
}
