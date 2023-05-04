package Inheritance;                               
import java.util.Scanner;
import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map.Entry;


public class firstletter {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		 String str;
		 str=sc.nextLine();
		 
		 splitWords(str);
		 

	}

	private static void splitWords(String str) {
		// TODO Auto-generated method stub
		
		
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String s=words[i];
			System.out.println(s.charAt(0));
			
			
		}
		
	}

}



