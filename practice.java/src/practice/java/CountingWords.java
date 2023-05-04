package practice.java;

import java.util.HashMap;
import java.util.Scanner;

public class CountingWords {

	public static void main(String[] args) {
		HashMap<String,Integer>hs=new HashMap<String,Integer>();
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String[]str2=str.split(" ");
		int c=1;
		for(String j:str2)
		{
			if(!hs.containsKey(j))
			{
				hs.put(j,c);
				
				
			}
			
			else
				
			{
				
				hs.put(j, c+1);
			}
			
			
			
		}
		
		for(String t: hs.keySet())
		{
			
			
			System.out.println(t +" " +hs.get(t));
		}
		

		
		
	

	}

}
