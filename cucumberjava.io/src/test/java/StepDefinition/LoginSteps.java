package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver=null;




	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		
		System.setProperty("webDriver.gecko.driver","/Users/shaheenhaider/eclipse-workspace/DemoProject/CucumberDemo1/src/test/resources/drivers/geckodriver 2");
         driver=new FirefoxDriver();
         Thread.sleep(2000);
       
	
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		
		System.out.println("User entering name and pass");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {

		System.out.println("User clicking loginb button");
	}

	@Then("User is navigate to the homepage")
	public void user_is_navigate_to_the_homepage() {
		
		System.out.println("User navigate to home page");
	}


	
}

