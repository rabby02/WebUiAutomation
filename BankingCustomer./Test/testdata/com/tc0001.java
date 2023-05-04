package testdata.com;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.com.EditCiustomer;

public class tc0001 extends Baseclasss{
	
	@Test
	public void AddNewCustomer()
	{
		 driver.get(Baseurl);
		 EditCiustomer ec=new EditCiustomer(driver);
		 ec.setCustomer(CustomerName);
		 ec.setGender();
		 ec.setAdd();
		 ec.setCity(city);
		 ec.SetState(State);
		 ec.SetPin(pin);
		 ec.SetMobile(mno);
		 ec.SetMail(id);
		 ec.Setpwd(pwd);
		 ec.btnClick();
		
		
		
	}
	
	@Test
	public void titleTest()
	{
		
		 String t=driver.getTitle();
		 String Act=" Guru99 Bank New Customer Entry Page";
		 Assert.assertEquals(t, Act);
		 
	}

}
