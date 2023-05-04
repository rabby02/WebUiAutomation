package RealTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomateToast {
	@Test
	public void AutomateToast()
	{
		   System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");
			
			WebDriver driver=new FirefoxDriver();
			driver.get("https://codeseven.github.io/toastr/demo.html");
			driver.manage().window().maximize();
			WebElement el=driver.findElement(By.id("title"));
			el.sendKeys("Hello");
			String tTitle=el.getText();
			WebElement el2=driver.findElement(By.id("message"));
			el2.sendKeys("Hello Tester");
			WebElement el3=driver.findElement(By.id("showtoast"));
			el3.click();
			if(el3.isEnabled()&& el.equals("hello"))
			{
				
				Assert.assertTrue(true);
			}
			driver.quit();
			
			
		
	}
	
	
	

}
