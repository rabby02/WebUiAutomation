package Inheritance;
import java.util.Scanner;
import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Stack;
public class Reverse {
	
	static void reverseWord(String str)
	
	{
		Stack<Character>st=new Stack();
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)!=' ')
			{
				
				st.push(str.charAt(i));
				
				
			}
			else
			{
				
				while(st.empty()==false)
				{
					
					System.out.println(st.pop());
				}
				
			}
			
		}
		
		System.out.println(" ");
		
		while(st.empty())
		{
			
			System.out.println(st.pop());
			
			
		}
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str;
		str=sc.nextLine();
		
		reverseWord(str);
		// TODO Auto-generated method stub

	}

}
