package RealTime;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMidtrans {




	/*@Test
	public void BrowserTest() throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");		
    WebDriver driver=new FirefoxDriver();

    driver.get("https://demo.midtrans.com");
   // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    Thread.sleep(1000);



	}*/
	/*@Test
	public void pageIsDisplayed()
	{
		System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");		
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://demo.midtrans.com");

		WebElement Logo=driver.findElement(By.xpath("//*[@id='container']/div/div/div[1]/nav/div/h1/a"));

		if(Logo.isDisplayed())
		{

			Assert.assertTrue(true);
		}




	}*/

	/*@Test
	public void BuyNowbtnTest()
	{
		System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");		
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://demo.midtrans.com");
	    WebElement btn=driver.findElement(By.linkText("BUY NOW"));
	    btn.click();

	}*/

	/*@Test
	public void VerifyMidtran()
	{
		System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");		
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://demo.midtrans.com");
	    WebElement btn=driver.findElement(By.linkText("BUY NOW"));
	    btn.click();

	    List<WebElement>el= driver.findElements(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]"));
	    for(WebElement s: el)
	    {

	    	System.out.println(s.getText());


	    }



	}*/

	/*@Test
	public void CheckOutBtn()
	{
		System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");		
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://demo.midtrans.com");
	    WebElement btn=driver.findElement(By.linkText("BUY NOW"));
	    btn.click();
	    WebElement ckBtn=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[1]/div[4]/table/tbody/tr[1]/td[2]/input"));
	    if(ckBtn.isDisplayed()&& ckBtn.getText().equals("Budi"))
	    {
	    	System.out.println("Its displayed");


	    	Assert.assertTrue(true);
	    }
		WebElement el=driver.findElement(By.cssSelector("tr.table-content:nth-child(2) > td:nth-child(2) > input:nth-child(1)"));
		if(el.getText().contains("budi@utoo.com"))
		{

			Assert.assertTrue(true);
		}


	}*/
	/*@Test
	public void MailVerify()
	{
		System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");		
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://demo.midtrans.com");
	    WebElement btn=driver.findElement(By.linkText("BUY NOW"));
	    btn.click();
		WebElement el=driver.findElement(By.cssSelector("tr.table-content:nth-child(2) > td:nth-child(2) > input:nth-child(1)"));
		if(el.isEnabled())
		{

			Assert.assertTrue(true);
		}
	    List<WebElement>list=driver.findElements(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[4]/table/tbody"));
	    for(WebElement li:list)
	    {

	    	if(li.getText().contains("Email"))

	    	Assert.assertTrue(true);
	    	//break;
	    }



	}*/
	/*@Test
	public void checkOutFunctionality()
	{
		System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");		
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://demo.midtrans.com");
	    WebElement btn=driver.findElement(By.linkText("BUY NOW"));
	    btn.click();
	    WebElement ckOut=driver.findElement(By.xpath("//div[@class='cart-checkout']"));
	    ckOut.click();
	    if(ckOut.isEnabled())
	    {

	    	Assert.assertTrue(true);
	    }



	}*/

	@Test
	public void MerchanTDisplay()
	{
		System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.midtrans.com");
		WebElement btn=driver.findElement(By.linkText("BUY NOW"));

		btn.click();
		WebElement ckOut=driver.findElement(By.xpath("//div[@class='cart-checkout']"));
		ckOut.click();
		// WebElement merchant=driver.findElement(By.xpath("//div[@class='merchant-name']"));


	}



}
