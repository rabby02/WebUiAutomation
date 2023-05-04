package Inheritance;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriverInfo;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class driver
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated me
		
		System.setProperty("webdriver.gecko.driver", "/Users/shaheenhaider/Downloads/geckodriver");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.amazon.com");
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a=new Actions(dr);
	
	//	a.moveToElement(dr.findElement(By.xpath("//*[@id='nav-link-accountList']"))).build().perform();
		a.moveToElement(dr.findElement(By.xpath("//*[@id='nav-xshop']/a[2]"))).click();
		//dr.quit();
		//Handling iframe//
		
		
		
		
		
		
	/*	dr.get("https://formstone.it/components/dropdown/demo/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//Wait for every elements//
		
		WebDriverWait w=new WebDriverWait(dr,Duration.ofSeconds(5));//Wait for speciffic web element//
		w.until(ExpectedConditions.visibilityOf((WebElement) By.xpath(" //*[@id='demo_basic-dropdown-selected']")));*/
		
		
		//Drag and drop//
		
		
		//Actions a=new Actions(dr);
		//a.moveToElement(dr.findElement(By.xpath(""))).build().perform();
		
		 
		
		
		
		
		//WebElement el;
	 /* WebElement el=dr.findElement(By.xpath("//*[@id='demo_basic-dropdown-selected']"));
	  el.click();
	  
	  
	  Select sel=new Select(el);
	  sel.selectByIndex(1);*/
	  
	  ////*[@id="c"]/div[2]/div/div/div/p/select
			
	//	dr.findElement(By.xpath("mbsc-popup-overlay mbsc-popup-overlay-anchored mbsc-ios")).sendKeys("Argentina");
		
	    //c/div[2]/div/div/div/p/select
		/*dr.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1694255937%3A1675225022542497&authuser=0&continue=https%3A%2F%2Fmail.google.com&ec=GAlAFw&hl=en&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
        dr.findElement(By.id("identifierId")).sendKeys("yasinrabby3@gmail.com");
        //dr.findElement(By.xpath("//*['@class=VfPpkd-R:mnJb']")).click();
       dr.findElement(By.className("VfPpkd-vQzf8d")).click();*/
        
		/*
		//System.setProperty("webdriver.chrome.driver","shaheenhaider$ /Users/shaheenhaider/Downloads/chromedriver_mac64/chromedriver ");
		/*System.setProperty("webdriver.gecko.driver", "/Users/shaheenhaider/Downloads/geckodriver");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.sugarcrm.com/au/request-demo/");
		dr.manage().window().maximize();
		try
		{
			WebElement ddown=dr.findElement(By.name("ems_c"));
			//Select sel= new Select(ddown);
			//sel.selectByIndex(5);
			
			
			
			
			
		}
		catch(NoSuchElementException e)
		{
			
			System.out.println("Hello ");
			
			
		}
		
		
		System.out.println("Hello ");
		
		
		
		//waits in selenium
		//WebDriverWait wait=new WebDriverWait(dr,Duration.ofSeconds(10));
	//	WebElement el=dr.findElement(By.id(""));
		
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(el));
		
		/*dr.get("https://demoqa.com/login");
		dr.manage().window().maximize();
		WebElement uName=dr.findElement(By.xpath("//*[@id='userName']"));
		uName.sendKeys("Yasin Rabby");
		
		
		WebElement uPass=dr.findElement(By.id("password"));
		uPass.sendKeys("***123");
		
		WebElement logBtn= dr.findElement(By.id("login"));
		logBtn.click();		
		
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		try {
			//Locating web element
	
			WebElement logoutBtn = dr.findElement(By.xpath("//div[@class='text-right col-md-5 col-sm-12']//button[@id='submit']"));
			//Validating presence of element
			if(logoutBtn.isDisplayed()){
			//Performing action on web element
			logoutBtn.click();
			System.out.println("LogOut Successful!");
			}
			}
			catch (Exception e) {
			
			System.out.println("Incorrect login....");
			}*/
		
		
		
		
		
		
		
	/*	dr.get("https://www.google.com");
	 * 
	 */
		/*try
		{
			
			
			dr.findElement(By.name("fake")).click();
		}catch(NoSuchElementException e)
		{
			System.out.println("Element not found!");
			
			System.out.println("Hello");
			
		}
		System.out.println("Hello");
		
		
		/*dr.get("https://www.amazon.in");
		//dr.manage().window().maximize();
		Thread.sleep(4000);
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys("poco F1");
		dr.manage().window().maximize();
		
		Thread.sleep(4000);
		
		dr.findElement(By.className("nav-input")).click();
		//dr.findElement(By.linkText("ACM")).click();
		dr.findElement(By.id("nav-search-submit-button")).click();
		dr.findElement(By.linkText("ACM")).click();
		
		dr.navigate().to("http://google.com");
		Thread.sleep(4000);
		dr.navigate().back();
		dr.quit();*/
		/*dr.get("https://www.edureka.co/search");
		dr.manage().window().maximize();
		Thread.sleep(4000);
		//dr.findElement(By.id("search-box")).sendKeys("Big Data");
		//
		\dr.findElement(By.className("search_result_web hide")).click();
		dr.findElement(By.className("viewdetailsbtn")).click();*/
		
	
		
	/*	dr.get("https://www.bing.com");
		
		
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();    
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//defines the amount of time that Selenium will wait for a page to load.
		
		JavascriptExecutor js=(JavascriptExecutor) dr;
		
		WebElement username=dr.findElement(By.id("sb_form_q"));
		//Id are always unique in webpage//
		username.sendKeys("yahoo login");
		dr.findElement(By.className("search_svg")).click();		
		Thread.sleep(3000);
		
		//dr.findElement(By.name("go")).click();
		//dr.close();
		//dr.findElement(By.linkText("YouTube")).click();
		/*dr.findElement(By.className("ytd-searchbox")).sendKeys("Hello java");
		dr.findElement(By.className("style-scope ytd-searchbox")).click();*/
	  // dr.findElement(By.linkText("Yahoo - login")).click();
	    //dr.findElement(By.xpath("//input[@id='login-username']")).sendKeys("Shaheenrano_@yahoo.com");
	  // dr.findElement(By.xpath("//*[@id='login-username']"));*/
	   
	   
		//String at=dr.getTitle();
		
		
		
		
			
			//System.out.println(at);
		//Locator best practice//
		//Used on particualat action on selenium web elemenrt//
			
			//Linktest means the hperlink of the webpage//
	/*	dr.manage().window().maximize();
		//dr.manage().deleteAllCookies();
	//	dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//    dr.manage().timeouts().implicitlyWait(null);
		dr.get("https://www.ebay.com");
		dr.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("Guitar");
		WebElement searchicon=dr.findElement(By.xpath("//*[@id='gh-btn']"));
		searchicon.click();*/
		
		//Waits in selenium//
		
		
	//	dr.manage().deleteAllCookies();
	//	dr.get("https://www.facebook.com");
		//dr.manage().window().maximize();
	//	dr.findElement(By.id("email")).sendKeys("yasinrabby3@gmail.com");
		
	//	WebElement f=dr.findElement(By.name("first name"));
		//WebElement l=dr.findElement(By.name("lastname"));
		//WebElement firstname;
		//WebElement forgotAccount=dr.findElement(By.linkText("Forgotten account?"));
		       
		
	//	clickOn(dr,forgotAccount,10);
		
		
		//Alerts in Selenium//
		//Alerts are basically popup boxes that take your focus away from the current browser and forces you to read the alert mressage//
		
		//dr.get("https://demo.automationtesting.in/Alerts.html");
	//	dr.findElement(By("OkTab")).click();
		//dr.findElement(By.class("btn btn-danger")).click();
		//dr.findElement(By.className(""))
		//dr.findElement(By.cssSelector(".btn-primary")).click();
		//dr.findElement(By.className("btn btn-danger")).click();
		
	/*	dr.findElement(By.cssSelector("ul.nav-tabs > li:nth-child(2) > a:nth-child(1)")).click();
		dr.findElement(By.cssSelector(".btn-primary")).click();
		Alert alert=dr.switchTo().alert();
		String getText=dr.switchTo().alert().getText();
		System.out.println(getText);
		Thread.sleep(3000);*/
		
		//Robot robot=new Robot();*/
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	
		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}
	
	/*public static void sendKeys(WebDriver driver1, WebElement element,int i,String value)
	{
		
		
		new WebDriverWait(driver1, i).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void clickOn(WebDriver driver1, WebElement element,Duration timeout)
	{
		
		
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}*/
	
	
	

}
