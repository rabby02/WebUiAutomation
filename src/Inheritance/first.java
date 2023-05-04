package Inheritance;
import java.util.Scanner;
import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map.Entry;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="YasinUddin";
		countVowels(str);
		

	}

	private static void countVowels(String str) {
		// TODO Auto-generated method stub
		
		
		int v=0;
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			
			
			
			
			if(isVowel(str.charAt(i)))
			{
				
				
				v++;
			}
			else
			{
				
				c++;
			}
		}
		
		System.out.println(v);
		System.out.println(c);
	}

	private static boolean isVowel(char ch) {
		// TODO Auto-generated method stub
		
		ch=Character.toUpperCase(ch);
		
		return(ch=='A'|| ch=='E'||ch=='I'||ch=='O'|| ch=='U');
	}

}


