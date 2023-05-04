package practice.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Collection {
	
	
	

	public static void main(String[] args) {
		
		//We will code about ArrayList//
		
	//	ArrayList<String>arr=new ArrayList<String>();
		/*arr.add("Toyota");
		arr.add("Ford");
		arr.add("Dodge");
		arr.add("BMW");
		arr.add("Tesla");
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++)
		{
			
			
			System.out.println(arr.get(i));
			
		}*/
		
	/*/*ArrayList<Integer>arr=new ArrayList<Integer>();
		arr	.add(1);
		arr.add(26);
		arr.add(34);
		arr.add(3);
		arr.add(7);
		arr.add(2);
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++)
		{
			
			System.out.println(arr.get(i));
		}
		
		arr.set(2, 12);
		System.out.println(arr);*/
	/*	HashMap<Integer,String>hs=new HashMap<Integer,String>();
		hs.put(1, "Bangladesh");
		hs.put(2, "United States");
		hs.put(3, "Saudi Arabia");
		hs.remove(2,"United States");
		/*for(int i: hs.keySet())
		{
			
			System.out.println(i);
		}
		for(String i: hs.values())
		{
			
			System.out.println(i);
		}
		System.out.println(hs.size());*/
		
		// Create a HashMap object called people
	    /*HashMap<String, Integer> people = new HashMap<String, Integer>();

	    // Add keys and values (Name, Age)
	    people.put("John", 32);
	    people.put("Steve", 30);
	    people.put("Angie", 33);

	    for (String i : people.keySet()) {
	      System.out.println("Name: " + i + " Age: " + people.get(i));
	    }*/
		
		/*HashSet<String>set=new HashSet<String>();
		
		
		set.add("Aziz");
		set.add("Khokon");
		set.add("Rahad");
		set.add("Saidul");
		set.add("Deen");
		for(String i: set)
		{
			
			
			if(set.contains("Rahad"))
			{
				
				System.out.println("Hello");
				break;
				
			}*/

			HashSet<Integer>hs=new HashSet<Integer>();
			hs.add(2);
			hs.add(3);
			hs.add(7);
			hs.add(8);
			hs.add(9);
			hs.add(12);
			
			for(int i = 1;i<=12;i++)
			{
				
				if(hs.contains(i))
				{
					System.out.println(i +" Found");
				}
				else
				{
					
					System.out.println(i +" Not found");
				}
			}
			
			
		
	

	}


}
