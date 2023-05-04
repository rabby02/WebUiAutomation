package TestngScript;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriverInfo;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;


public class Assertion{
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/shaheenhaider/Downloads/geckodriver");
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/?tag=operagx-desktop-us-20");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
	//WebDriver driver;

	
	
	/*@Test
	public void testAssertEqual()
	{
		
		
		String exp="Yasin";
		String act="Yasin";
		
		AssertJUnit.assertEquals(act,exp);
	}
	
	@Test
	public void AssertTrue()
	{	
		
		int sum = 0;
		
		for(int i=1;i<10;i++)
		{
			sum=sum+i;
			
		}
		
		AssertJUnit.assertTrue(sum>5);
		
		
	}
	
	@Test
	public void AssertFalse()
	{
		
		int x=7;
		
		AssertJUnit.assertFalse(x<0);
	}*/
	
	

}
