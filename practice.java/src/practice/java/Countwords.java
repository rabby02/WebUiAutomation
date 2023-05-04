package practice.java;

import java.util.HashMap;

public class Countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>hs=new HashMap<>();
		
		
		String str1="I am learning learning Java java";
		
		
		String[]arrstr2=str1.split(" ");
		int c=1;
		for(String i:arrstr2)
		{
			
			if(!hs.containsKey(i))
			{
				
				
				hs.put(i, c);
			}
			else
			{
				
				
				hs.put(i, c+1);
			}
			
		}
		
		for(String x:hs.keySet())
		{
			
			
			System.out.println(" "+x  +" "+hs.get(x));
		}
		
		
		

		
		
	}

}
