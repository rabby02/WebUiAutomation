package practice.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicates {
	
	//Algorithm
	//1.Create a string
	//2.Create another method for duplication
	//3.Create Hashset and String Buffer(Set<Character>set=new HashSet<>() && StringBuffer sf=new StringBuffer() ))
	//Extracting  the character from string//
	//Add it into the hashest//
	//Append in=t to the stringBuffer convert in toString//
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.nextLine();
		
		System.out.println(removeDuplicate(str));

	}
	
	public  static String removeDuplicate(String str)
	{
		Set<Character>set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			
			Character c=str.charAt(i);
			if(!set.contains(c))
			{
			    set.add(c);
			    sf.append(c);
			}
			
		}
		
		
		return sf.toString();
	}
	
	
	
	
	
	
	

}
