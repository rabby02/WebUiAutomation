package testdata.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclasss {
	public String Baseurl="https://demo.guru99.com/v3/manager/addcustomerpage.php";
	
	public String CustomerName="Yasin";
	public String newAdd="1801,120ty St,College Point,NY";
	public String city="College Point";
	public String State="New York";
	public String pin="211414";
	public String mno="4614";
	public String id="yasinrabby2114@icloud.com";
	public String pwd="Rajurabby2114";
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		
        System.setProperty("webdriver.gecko.driver","/Users/shaheenhaider/Downloads/geckodriver");
    	driver=new FirefoxDriver();
	    
		
	}
	
	/*public void tearDown()
	
	{
		
		driver.quit();
	}*/

}
