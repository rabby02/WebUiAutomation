package PageObject.com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCiustomer {
	
	WebDriver ldriver;
	
	public EditCiustomer(WebDriver rdriver)
	{
		
		
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
		
	}
	
	@FindBy(name="name")
	WebElement customerAdd;	
	@FindBy(name="rad1")
	WebElement ckBox;
	DateFormat dateformat=new SimpleDateFormat("mm/dd/yyyy");
	Date date=new Date();
	String d1=dateformat.format(date);
	
	
	@FindBy(name="addr")
	WebElement Address;
	@FindBy(name="city")
	WebElement City;
	@FindBy(name="state")
	WebElement st;
	@FindBy(name="pinno")
	WebElement Pin;
	@FindBy(name="telephoneno")
	WebElement tel;
	@FindBy(name="emailid")
	WebElement Id;
	@FindBy(name="password")
	WebElement pwd;
	@FindBy(name="sub")
	WebElement btn;
	public void setCustomer(String uname)
	{
	
		customerAdd.sendKeys(uname);
		
	}
	public void setGender()
	{
		ckBox.click();
		
		
	}
	
	public void setAdd()
	{
		 
		
	}
	
	public void setAdd(String As)
	{
		Address.sendKeys(As);
		
	
		
	 
		
	}
	public void setCity(String city)
	{
		City.sendKeys(city);
		
		
		
		
	}
	public void SetState(String state)
	{
		st.sendKeys(state);
		
	}

   public void SetPin(String pin)
   {
	   Pin.sendKeys("2114");
	
	
   }
   public void SetMobile(String Mno)
   {
	   tel.sendKeys(Mno);
	
	
   }
   public void SetMail(String ID)
   {
	   Id.sendKeys(ID);
	
	
   }
   public void Setpwd(String Pwd )
   {
	   
	   pwd.sendKeys(Pwd);
   }
   public void btnClick()
   {
	   btn.click();
	   
	   
   }
	
	
	
	
	
	
	
	
	
	
}
