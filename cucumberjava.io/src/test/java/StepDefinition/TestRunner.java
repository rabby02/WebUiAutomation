package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/shaheenhaider/eclipse-workspace/DemoProject/cucumberjava.io/src/test/resources",glue= {"StepDefinition"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/report.xml"})





public class TestRunner {
	

}


