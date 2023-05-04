package papiyaSul;

import org.testng.annotations.DataProvider;

public class LinktoData extends Datapro  {
	
@DataProvider(name="Data-provider")
	
	public Object[][] getData()
	{
		
		return new Object[][]
				{
			
			{3,5,8},{5,6,11},{10,20,30}
			
				};
		
		
		
		
	}

@DataProvider(name="getLength")

public Object[][] Length()
{
	
	return new Object[][]
			{
		
		{"Hello",5},{"papiya",6},{"HelloworldHelloworld",20}
		
			};
	
	
	
	
}



}
