package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Dropdown {
	private static final boolean DataAvailable = false;
	WebDriver Dr;
	
	@Test
	public void Win()
	{
		Dr=new ChromeDriver();
		Dr.get("https://demoqa.com/text-box");
		Dr.findElement(By.xpath("//*[@id='userName']")).sendKeys("Yasin Rabby");
		Dr.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("yasinrabby3@gmail.com");
		Dr.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("1801 120th college point");
		Dr.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys("801 120th college point");
		Dr.findElement(By.xpath("//*[@id='submit']")).click();
	}
	
	@Test
	public void checkBox()
	{
		Dr=new ChromeDriver();
		Dr.get("https://demoqa.com/checkbox");
		Dr.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/label/span[3]")).click();
		
		
		
		
		
	}
	
	
	 
	
	/*@Test
	
	public void TryCheckBox()
	{
		Dr=new ChromeDriver();
		
		Dr.get("https://demo.guru99.com/test/radio.html");
		WebElement el=Dr.findElement(By.xpath("//*[@id='vfb-7-1']"));
		
		el.click();
		
		if(el.isEnabled())
		{
			
			
			System.out.println("Hellon Qa");
		}
		else
		{
			
			System.out.println("h");
		}
		
	}
	*/
/*	@Test
	public void Webtable()
	{
		
		
		Dr=new ChromeDriver();
		Dr.get("https://demoqa.com/webtables");
		Dr.findElement(By.xpath("//*[@id='addNewRecordButton']")).click();
		Dr.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Yasin");
		Dr.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Rabby");
		Dr.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("yasinrabby3@gmail.com");
		Dr.findElement(By.xpath("//*[@id='age']")).sendKeys("22");
		Dr.findElement(By.xpath("//*[@id='salary']")).sendKeys("20000");
		Dr.findElement(By.xpath("//*[@id='department']")).sendKeys("Cste");
		Dr.findElement(By.xpath("//*[@id='submit']")).click();
		
	}*/
	/*@Test
    public void ButtonTest()
	{
		
		Dr=new ChromeDriver();
		Dr.get("https://demoqa.com/buttons");
		Actions ac=new Actions(Dr);
		WebElement tr=Dr.findElement(By.xpath("//*[@id='doubleClickBtn']"));
		
		ac.doubleClick(tr).perform();
	}*/
	
	/*@Test
	public void automationPractfor()
	{
		
		
		
		Dr=new ChromeDriver();
		Dr.get("https://demoqa.com/automation-practice-form");
		Actions Ac=new Actions(Dr);
		WebElement f=Dr.findElement(By.xpath("//*[@id='state']"));
		f.click();
		
		
	}*/
	
	/*@Test
	public void UploadAndDownload()
	{
		
		Dr=new ChromeDriver();
		Dr.get("https://demoqa.com/upload-download");
		Actions t=new Actions(Dr);
		WebElement p=Dr.findElement(By.xpath("//*[@id='downloadButton']"));
		t.click(p).perform();
		
		
		
		
		
	}*/
	
	/*@Test
	public void UploadandDownload()
	{
		
		Dr=new ChromeDriver();
		Dr.get("https://demoqa.com/upload-download");
		Actions f=new Actions(Dr);
		WebElement g=Dr.findElement(By.xpath("//*[@id='uploadFile']"));
		f.moveToElement(g).perform();
		
	}*/
	
	@Test(enabled=false)
	public void testCaseEnabling()
	{
		
		
		System.out.println("Skip it");
	}	
	
	@Test
	public void testCaseSkipException()
	{
		
		
		
		System.out.println("I m in skip mode");
		throw new SkipException("skipping the test case");
	}
	@Test
	public void testCaseConditionalSkipException()
	{
		
		
		
		System.out.println("Conditional approach");
		if(!DataAvailable)
			throw new SkipException("Skkipi");
			System.out.println("Conditional");
	}
	
	
	
	
	/*@BeforeMethod
	public void beforeMethod()
	{
	
		
		System.out.println("Starting on chromeBrowser");
	}
	
	@AfterMethod
	public void AfterMethood()
	{
		
		Dr.close();
		System.out.println("Script");
	}
	
	
	
	@Test
	
	public void SoftAssDem()
	{
		SoftAssert assertion=new SoftAssert();
		System.out.println("Test 1 started succesfully");
		assertion.assertEquals(12, 13);
		System.out.println("Test comp");
		assertion.assertAll();
		
		
		
		
		
		
		
	}
	
	@Test
	public void HardAssert()
	{
		Assert.assertEquals(12, 13);
		System.out.println("Hello");
		
	
	}*/
	
	/*@Test
	
	public void TestGoogle()
	{
		
		
		
	}
	
	
	//Testng parameter//
	@Test
	public void TestNg()
	{
		
		Dr=new ChromeDriver();
		Dr.get("https://www.amazon.com/ref=nav_logo");
		
		
	}
	
	@Test
	
	public void LoginCredentials()
	{
		
		
		
	}
	
	@Test
	public void verifYLogin()
	{
		
		
		
	}*/
	
	
	



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/* WebDriver Dr;
		 Dr=new ChromeDriver();
		 Dr.manage().window().maximize();
		 Dr.get("https://www.youtube.com/");*/
		
       

	}
	

}
