/*package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver=null;

	

@Given("Browser is open")
public void browser_is_open() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	
	System.setProperty("webDriver.gecko.driver","/Users/shaheenhaider/eclipse-workspace/DemoProject/CucumberDemo1/src/test/resources/drivers/geckodriver 2");
    driver=new FirefoxDriver();
    Thread.sleep(2000);
}

@Given("User is on the search page")
public void user_is_on_the_search_page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	
	System.out.println("User navigate to search textbox page");
}

@When("User enter some text in google searchbox")
public void user_enter_some_text_in_google_searchbox() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();

	System.out.println("User giving text in textbox page");

}

@Then("user navigate to seachresult page")
public void user_navigate_to_seachresult_page() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	System.out.println("User navigate to search result page");
	
	
}

}*/
