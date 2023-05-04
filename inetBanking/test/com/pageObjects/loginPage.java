package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	public loginPage(WebDriver driver)
	{
		
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement Logo=driver.findElement(By.xpath("//*[@id='container']/div/div/div[1]/nav/div/h1/a"));
	public WebElement BuyNowBtn=driver.findElement(By.linkText("BUY NOW"));
	public WebElement verifyMidtran=driver.findElement(By.xpath("//*[@id='container']/div/div/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[1]"));
	public WebElement checkOutBtn=driver.findElement(By.className("cart-checkout"));
	public WebElement nameOncPage=driver.findElement(By.xpath("//input[@value='text'](1)"));
	public WebElement email=driver.findElement(By.xpath("//input[@value='budi@utomo.com']"));
	public WebElement phone=driver.findElement(By.xpath("//input[value='081808466410']"));
	public WebElement city=driver.findElement(By.xpath("//input[@value='Jakarta']"));
	public WebElement address=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[4]/table/tbody/tr[5]/td[2]/textarea"));
	public WebElement postal=driver.findElement(By.xpath("//input[@value='10220']"));
	public WebElement DemoStorePageLogo=driver.findElement(By.xpath("//div[@class='merchant-name']"));
	public WebElement OrderSummary=driver.findElement(By.xpath("/html/body/div[3]/div/nav/div[2]/div/div"));
	public WebElement OrderId=driver.findElement(By.className("header-order-id"));
	public WebElement OrderName=driver.findElement(By.xpath("/html//div[@class='page-container scroll']"));
	
    @FindBy(xpath = "//div[@class='page-container scroll']")
    public WebElement paymentSection;
    @FindBy (xpath = "//img[@alt='expand']")
    public WebElement ScrollDown;
    public List<WebElement> PayMentSection=driver.findElements(By.xpath("//div[@class='list-title text-actionable-bold']"));
    @FindBy(xpath = "//div[text()='Credit/debit card']")
    public WebElement CreditCradPayment;
    
    public WebElement CardDetailsScreen=driver.findElement(By.cssSelector(".text-actionable-bold"));
    public WebElement AmountBeforeCart=driver.findElement(By.className("header-amount"));
    public List<WebElement>CardInputrValues=driver.findElements(By.className("valid-input-value"));
    
    
    
    
	
	
	
	
	
	
	

}
