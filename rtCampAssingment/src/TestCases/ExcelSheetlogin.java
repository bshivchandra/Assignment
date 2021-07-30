package TestCases;


import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class ExcelSheetlogin {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       System.out.println("hello world");
       
   System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
       WebDriver driver= new ChromeDriver();
       driver.get("https://qa.rtcamp.net/activity/");
      System.out.println(driver.getTitle()); 
      
      FileInputStream file=new FileInputStream("./Test Data\\LoginData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int numrows=sheet.getLastRowNum();
		System.out.println(numrows);
		String usernm="";
		String pass="";
		for(int i=0; i<=numrows; i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
			 usernm=currentrow.getCell(0).getStringCellValue();
			 pass=currentrow.getCell(1).getStringCellValue();
		}
	
     driver.findElement(By.name("log")).sendKeys(usernm);
      driver.findElement(By.name("pwd")).sendKeys(pass);
      driver.findElement(By.name("wp-submit")).click();

      if(driver.getTitle().equals("Activity – rtCamp"))
      {
    	  Assert.assertTrue(true);
      }
      else
      {
    	  Assert.assertTrue(false);
      }
      driver.quit(); 
	}

}

		
	


