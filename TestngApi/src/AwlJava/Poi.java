package AwlJava;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Poi {
	
	public WebDriver Driver;
	
	public void DemoRadio() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/shaheenhaider/Downloads/geckodriver");
		Driver=new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		Thread.sleep(1000);
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
	}

}
