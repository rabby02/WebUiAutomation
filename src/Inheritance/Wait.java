package Inheritance;
import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriverInfo;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "/Users/shaheenhaider/Downloads/geckodriver");
		
		implicitWait();
		explicitWait();
		// TODO Auto-generated method stub
		
		

	}

	private static void implicitWait() {
		// TODO Auto-generated method stub
		
		
		
		
		
	}

	private static void explicitWait() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/shaheenhaider/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/ncr");
		
	}

}

