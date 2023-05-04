package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;

public class LogSteps2_POM {
	
	WebDriver driver=null;
	loginpage lp;
	
	@Given("Browser is Open")
	public void browser_is_open() {
		
		System.out.println("Yeah i am inside");
		
		System.setProperty("webDriver.gecko.driver","/Users/shaheenhaider/eclipse-workspace/DemoProject/CucumberDemo1/src/test/resources/drivers/geckodriver 2");
	    driver=new FirefoxDriver();
	}

	@Given("User is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
		//loginpage lp=new loginpage(driver);
		driver.get("https://example.testproject.io/web/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

	}

	@When("^User enter (.*) and (.*)$")
	public void user_enter_user_name_and_password(String username, String password) throws InterruptedException {
		
	    lp=new loginpage(driver);
		lp.enterUsrName(username);
		lp.enterPassword(password);
		lp.clickLogin();
		/*WebElement Name=driver.findElement(By.id("name"));
		Name.sendKeys(username);
		WebElement Pass=driver.findElement(By.id("password"));
		Pass.sendKeys(password);
		Thread.sleep(2000);*/
		
	    
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		
		/*WebElement log=driver.findElement(By.id("login"));
		log.click();*/
		lp.clickLogin();
		
	    
	}

	@Then("User navigate to the home page")
	public void user_navigate_to_the_home_page() {
	  
	}


}
