package TestNG16MAY;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllinOne
{
	WebDriver driver;
	@BeforeSuite
	public void openbrowser()
	{
	 System.out.println("Open browser");
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\chromedriver\\chromedriver.exe");
	 driver=new ChromeDriver();
	}
	
	@BeforeTest
	public void EnterURL()
	{
		System.out.println("Enter URL");
	}
	@BeforeClass
	public void MaxBrowser()
	{
		System.out.println("Maximize Browser");
	}
	
	@BeforeMethod
	public void GetCookies()
	{
		System.out.println("Get Cookies");
	}
  @Test
  public void indeedjobsearch() throws InterruptedException 
  {
		System.out.println("Indeed IN");
		driver.get("https://in.indeed.com/");
		Thread.sleep(2000);
		System.out.println("Indeed Job Search");
		driver.findElement(By.id("text-input-what")).sendKeys("QA Automation Engineer");
		Thread.sleep(2000);
		driver.findElement(By.id("text-input-where")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println("Indeed Out");
  }
  @Test
  public void naukrilogin() throws InterruptedException 
  {
       System.out.println("Naukri In");
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		System.out.println("Naukri login");
		driver.findElement(By.xpath("(//div[@class='mTxt'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("ithapeyogi0912@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("yogi@0812");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("qsb-keyskill-sugg")).sendKeys("QA Automation Engineer");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
					System.out.println("Naukri Out");
		
  }
	  @Test
  public void indeedjobsearch() throws InterruptedException 
  {
		System.out.println("Indeed IN");
		driver.get("https://in.indeed.com/");
		Thread.sleep(2000);
		System.out.println("Indeed Job Search");
		driver.findElement(By.id("text-input-what")).sendKeys("QA Automation Engineer");
		Thread.sleep(2000);
		driver.findElement(By.id("text-input-where")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println("Indeed Out");
  }
  
  
  @AfterMethod
  public void GetScreenShot() throws IOException
  {
	  System.out.println("Take Screenshots");
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFileToDirectory(src, new File("C:\\Users\\sh\\eclipse-workspace\\TestNG16MAY\\Screeshots"));
	  
  }
  
  @AfterClass
  public void  DeleteCookies()
  {
	  System.out.println("Delete Cookies");
  }
  
  @AfterTest
  public void DBConnectionClosed()
  {
	  System.out.println("Database Closed");
  }
  
  @AfterSuite
  public void Close()
  {
	  System.out.println("Close Browser");
  }
}
