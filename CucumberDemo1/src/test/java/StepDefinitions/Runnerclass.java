package StepDefinitions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Users/shaheenhaider/eclipse-workspace/DemoProject/CucumberDemo1/src/test/resources/Features"},
glue={"StepDefinitions"},
monochrome=true,tags="@SmokeTest",plugin= {"junit","junit:target/JUnitReports/report.xml"})


public class Runnerclass {
	
	//User for username and pass for password// Parameterization means where we add variable and refer the value from the variables//
	//Feature file will run for the multiple sets of data//
	//Test is running according to our given data data comes from external file like excel scripts etc thats why tha is called data driven testing
	
	//How to run a feature multiple times for different sets pf data//
	
	

}


