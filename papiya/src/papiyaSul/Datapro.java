package papiyaSul;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapro {
	
	@Test(dataProvider="Data-provider")
	public void Test01(int a,int b,int res)
	{
		int total=a+b;
		
		Assert.assertEquals(total, res);
		
		
		
		
		
		
	}
	
	
	
	@Test(dataProvider="getLength")
	
	public void strstring(String name,int c)
	{
		int l;
		l=name.length();
		Assert.assertEquals(l, c);
		
		
		
	}
	
	

}
