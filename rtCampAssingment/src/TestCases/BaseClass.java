package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

 public class BaseClass {

		String baseurl="https://qa.rtcamp.net/activity/";
//		String username="demo"; 
//		String password="demo";  
		WebDriver driver;
		
		@BeforeClass
		public void setUp()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiv\\eclipse-workspace2\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get(baseurl);
		}
		@AfterClass
		public void tearEnd()
		{
			driver.quit();
		}
	}
