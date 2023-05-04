package com.mystore.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	
		public void HelloWorld()
		{
		System.setProperty("webdriver.gecko.driver", "/Users/shaheenhaider/Downloads/geckodriver");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.amazon.com");
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    dr.manage().deleteAllCookies();
	    dr.findElement(By.xpath(""))
	    
	 
		}
	
	

}
