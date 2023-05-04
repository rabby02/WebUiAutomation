package Inheritance;
import java.util.Scanner;
import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map.Entry;


public class stringcompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.nextLine();
		Map<Character,Integer>map= new LinkedHashMap<>(); //character means key integer means value//
		
		for(int i=0;i<str.length();i++) {
			
			
			
			if(map.get(str.charAt(i))!=null)
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
				
				
				
				
			}
			else
			{
				
				map.put(str.charAt(i), 1);
				
				
				
			}
			
			
		}
		
		
		
		//iterate the map//
		
		StringBuilder sb=new StringBuilder();
		
		
		
		
		
		for(Entry<Character,Integer>entry : map.entrySet())
		{
			sb.append(entry.getKey());
			sb.append(entry.getValue());
			
			
		}
		System.out.println(sb.toString());//Value urns into string format//
		
		
		

	}

}
