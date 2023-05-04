package RealTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class automateEdu {
	@Test
	public void automaTion() throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://learning.edureka.co/new-onboarding/userdetails?fromProfile=true&tab=userDetails");
        try {
	    	
	    	Thread.sleep(1000);
	    	
	    }catch(InterruptedException e)
	    {
	    	
	    	e.getStackTrace();
	    }
	   /* driver.get("https://www.edureka.co");
	    try {
	    	
	    	Thread.sleep(1000);
	    	
	    }catch(InterruptedException e)
	    {
	    	
	    	e.getStackTrace();
	    }
	    driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/span")).click();
        try {
	    	
	    	Thread.sleep(1000);
	    	
	    }catch(InterruptedException e)
	    {
	    	
	    	e.getStackTrace();
	    }
	    
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("si_popup_email")));
		actions.sendKeys("yasinrabby3@gmail.com");
		Thread.sleep(1000);
		actions.build().perform();
		/*actions.moveToElement(driver.findElement(By.id("si_popup_passwd")));
		actions.sendKeys("Rajurabby2114");
		Thread.sleep(1000);
		actions.build().perform();*/
		/*WebElement el=driver.findElement(By.id("si_popup_passwd"));
		el.sendKeys("Rajurabby2114");
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='new_sign_up_optim']/div/div/div[2]/div[3]/form/button")));
		actions.click();
		actions.build().perform();
		
		driver.navigate().to("https://learning.edureka.co/my-profile");*
		
	
		//*[@id="header-II"]/section/nav/div/ul[2]/li[2]/ul/li[4]/a")).click();
	//	driver.findElement(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/a")).click();
		
		//"/html/body/header/nav/div[4]/ul/li[6]/a"
		// driver.findElement(By.xpath("//*[class='dropdown-menu user-menu dropdown-menu-right']")).click();
		
		//driver.findElement(By.xpath("//*[/html/body/div[2]/table/tbody/tr[2]/td[2]/div/div/div']")).click();
		//el2.click();
		Thread.sleep(1000);*/
		
		
		
	}


}
