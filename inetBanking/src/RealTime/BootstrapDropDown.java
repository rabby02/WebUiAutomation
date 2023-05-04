package RealTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BootstrapDropDown {

@Test
public void DemoDrop()
{
	final int   mc=5;
	System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");
    WebDriver driver=new FirefoxDriver();
    try {
    	
    	Thread.sleep(1000);
    	
    }catch(InterruptedException e)
    {
    	
    	e.getStackTrace();
    }
    driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1");
    driver.findElement(By.id("btnDropdownDemo")).click();
   List<WebElement>el= driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/div/div/div/a"));
   for(WebElement t: el)
   {
	   if(t.getText().equals("jQuery"))
	   {
		   
		   
		   t.click();
	   }
   }
   // driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/div/div/div")).click();
    
    
    
}

}
