package RealTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonSignInPage {
	
	@Test
	public void verifySignIn() throws InterruptedException
	{
		 /*  System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");		
  		   WebDriver driver=new FirefoxDriver();
		   driver.get("https://www.amazon.com/");
		   driver.manage().window().maximize();
		   WebElement x=driver.findElement(By.linkText("Your Account"));
		   x.click();
		   WebElement exp=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			  
		   Actions act=new Actions(driver);
		   
		   act.moveToElement(exp).perform();
		   
		   
		   WebElement y=driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a"));
		   y.click();
		  // driver.navigate().to("https://www.amazon.com/ap/signin");
	
		  WebElement mail=driver.findElement(By.id("ap_email"));
		   mail.sendKeys("yasinrabby2114@icloud.com");
		   
		   WebElement dj=driver.findElement(By.id("continue"));
		   dj.click();
		   
		 //  WebElement fk=driver.findElement(By.id("ap_password"));
		   //fk.sendKeys("Rajurabby2114");
		 //  WebElement sb=driver.findElement(By.id("signInSubmit"));
		//   sb.click();
		  //Thread.sleep(2000);
		 //  WebElement btn=driver.findElement(By.xpath("//*[@id='continue']"));
		 //  btn.click();
		  /* WebElement pwd=driver.findElement(By.id("ap_password"));
		   pwd.sendKeys("Rajurabby2114");
		  Thread.sleep(2000);
		   WebElement submitBtn=driver.findElement(By.id("signInSubmit"));
		   submitBtn.click();
		  /* WebElement exp=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		  
		   Actions act=new Actions(driver);
		   
		   act.moveToElement(exp).perform();
		   
		   WebElement sin=  driver.findElement(By.className("nav-action-inner"));
		   sin.click();*/
		   
		   
		   
		
	}
	
	/*@Test
	public void WebElementTest()
	{
		System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");		
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.amazon.com/");
	    List<WebElement>ListOf= driver.findElements(By.tagName("a"));
	    for(WebElement a: ListOf)
	    {
	    	if(a.getText().equals("New Releases"))
	    	{
	    		
	    		a.click();
	    		break;
	    	}
	    	
	    }
	    
	     
		
		
	}*/
	
	/*@Test
	public void IphoneTest()
	{
		System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");		
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.amazon.com/");
	    List<WebElement>li=driver.findElements(By.xpath("//*[class='a-carousel']"));
	    for(WebElement l: li)
	    {
	    	
	    	
	    }
		
		
		
	}*/
	
	
	@Test
	public void iphoneImage()
	{
		System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");		
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.amazon.com/");
	    WebElement el=driver.findElement(By.id("twotabsearchtextbox"));
	    el.sendKeys("iphone");
	    WebElement sb=driver.findElement(By.id("nav-search-submit-button"));
	    sb.click();
	    
	    List<WebElement>listing=driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div/div/span/div/div[1]/div/div/div/ol"));
	    for(WebElement t: listing)
	    {
	    	
	    	if(t.getText().equals("iPhone 13 Pro Max"))
	    	{
	    		//driver.navigate().to("https://www.amazon.com/dp/B09V3HZ8B5/?pd_rd_w=N8jEk&content-id=amzn1.sym.04e31e32-5e01-4048-8b59-a557891d595f:amzn1.sym.04e31e32-5e01-4048-8b59-a557891d595f&pf_rd_p=04e31e32-5e01-4048-8b59-a557891d595f&pf_rd_r=7YG4NEWFT6CWE0D9KNZB&pd_rd_wg=mWke0&pd_rd_r=5d4c4877-43a6-43a7-9a8d-5837081a6a4e&ref_=vn_s_iwp&qid=1679551801");
	    		
	    		WebElement h=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div/div/span/div/div[1]/div/div/div/ol/li[1]/div/div/div/div[1]/div[2]/div/a/img"));
	    		h.click();
	    		break;
	    	}
	    }
	    
		
		
	}

}
