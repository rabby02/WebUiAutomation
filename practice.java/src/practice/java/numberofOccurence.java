package practice.java;

import java.util.HashMap;
import java.util.HashSet;

public class numberofOccurence {

	public static void main(String[] args) {
		HashMap<String,Integer>hs=new HashMap<String,Integer>();
		String str="Java is a coding language";
		//int res=str.length()-str.replaceAll("a", "").length();
		//System.out.println(res);
		String[]str2=str.split(" ");
		
	
		int j=0;
		int c=1;
		
		for(String x:str2)
		{
			if(!hs.containsKey(x))
			{
				hs.put(x, c+1);
				j++;
			}
			

			
			
		}
		
		
			System.out.println(j);
			
		
		
		

	}
	

}
