package TestngScript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sataprovider {
	
	@Test(dataProvider= "getData")
	public void AdmissionLogin(String user,String password)
	{
		
		System.out.println("Admission Login");
		System.out.println(user);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData()
	{
		
		
		Object[][]data=new Object[3][2];
		data[0][0]="user1";
		data[0][1]="Password1";
		data[1][0]="user2";
		data[1][1]="password2";
		data[2][0]="User3";
		data[2][1]="Password3";
		
		return data;
	}
	

} 
