package RealTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop {
	@Test
	public void LoanEmiTest() throws InterruptedException
	{
        System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://emicalculator.net");
		WebElement hLoan=driver.findElement(By.cssSelector("#loanamountslider >span"));
		WebElement IntS=driver.findElement(By.cssSelector("#loaninterestslider >span"));
		
		WebElement lnten=driver.findElement(By.cssSelector("#loantermslider >span"));
		
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(hLoan, 83, 0).build().perform();
		Thread.sleep(2000);	
		act.dragAndDropBy(IntS, 88, 0).build().perform();
		Thread.sleep(2000);	
		act.dragAndDropBy(lnten, -111, 0).build().perform();
		
		WebElement el=driver.findElement(By.cssSelector("#emiamount > p:nth-child(2) > span:nth-child(1)"));
		
		String gt=el.getText();
		if(gt.equals("86,381"))
		{
			
			Assert.assertTrue(true);
		}
		
		
		
	}
	

}
