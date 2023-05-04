import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;  

public class Demo {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.safari.driver",  null);
		
		
		
        
		/*driver.navigate().to("http://www.javatpoint.com/");  
		driver.findElement(By.id("gsc-i-id1")).sendKeys("javatpoint tutorials");  
		 
		driver.findElement(By.name("btnK")).click();  
	    
	    driver.close();
	    */
		
        // Instantiate a SafariDriver class.   
		
		
		
      //  WebDriver driver = new SafariDriver();  
       // driver.manage().window().maximize();
        
  
          // Launch Website  
       // driver.navigate().to("funimation.com");  
              
          // Click on the search text box and send value  
       // driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
              
          // Click on the search button  
       // driver.findElement(By.name("btnK")).click();  
          
          //Close the Browser  
      //  driver.close();  
        //driver.navigate().to("https://www.javatpoint.com/selenium-webdriver-handling-drop-downs");
		
		
		/*WebDriver wd=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", null);
		wd.navigate().to("https://www.facebook.com");
		*/
		
        // System Property for Chrome Driver   
     System.setProperty("webdriver.chrome.driver", null);  
       
          // Instantiate a ChromeDriver class.     
     WebDriver driver=new ChromeDriver();  
       
        // Launch Website  
     driver.navigate().to("http://www.javatpoint.com/");  
       
      //Maximize the browser  
       driver.manage().window().maximize();  
       
       //Scroll down the webpage by 5000 pixels  
     //JavascriptExecutor js = (JavascriptExecutor)driver;  
    // js.executeScript("scrollBy(0, 5000)");   
       
      // Click on the Search button  
     driver.findElement(By.linkText("Core Java")).click();  
     
     //Why use selenium? 
        
        
        
        
        
        
        
        
        
        
	    
	    
	    
	    
        
		
	    
		
		
	    
		
		
		
		//driver.findElement(By.id("ta1")).sendKeys("yas");
		
		
		
		
		
		
	    
		
	    
		
		
		
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	
		
		
		//WebElement main1=driver.findElement(By.id("main"));
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

	
	
	
}







