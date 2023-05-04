package Inheritance;

import java.util.Scanner;
import java.lang.*;
import java.util.*;
import java.util.ArrayList;

public class Expert {
	
	
	static void perimeter(int l,int b)
	{
		
		
		int perimeter=2*(l+b);
		System.out.println(perimeter);
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		
		
		
		
	
		
		/*Scanner sc=new Scanner(System.in);
		String bc=sc.nextLine();
		String bd="hi";
		System.out.println(bd);
		
		for(int i=0;i<100;i++)
		{
			
			
			System.out.println(i);
			
			
		}
		*/
		
		
		/*String str="Madam";
		String revstr="";
		int len=str.length();
		for(int i=len-1;i>=0;--i)
		{
			
			
			revstr=revstr + str.charAt(i);
		}
	
		if(str.toLowerCase().equals(revstr.toLowerCase()))
		{
			System.out.println(str + " palindrome");
		}
		else
		{
			
			System.out.println(str +" not palindrome");
		}
		// TODO Auto-generated method stub*/
		
		
	/*	ArrayList<String> adder=new ArrayList<String>();
		
		adder.add("         Alvarez        Messi   ");
		
		adder.add("Allister    enz0    paredes     De paul");
		adder.add("Acuna      otamendi      Romero       Molina");
		
		adder.add("              Martinez");
		
		
		
		
		 
		int t=adder.size();
		
		for(int j=0;j<t;j++)
		{
			
			System.out.println(adder.get(j));
		}*/
		/*int a=1;
		int b=4;
		int c=7;
		
		ArrayList<Integer>SumofArr=new ArrayList<>();
		SumofArr.add(a);
		SumofArr.add(b);
		SumofArr.add(c);
		
		System.out.println(Collections.max(SumofArr));*/
		Scanner sc=new Scanner(System.in);
		int h,c;
		/*int f=1;
		int i;
		int n;
		n=sc.nextInt();
		for( i=1;i<n;i++)
		{
			
			
			f=f*i;
		}
		System.out.println(f);
		
	    double  p=1000;
		double c=10;
		double r=5;
		double x= p *
         (Math.pow((1 + r/ 100), c));*/
		
		h=sc.nextInt();
		c=sc.nextInt();
		perimeter(h,c);

		
		
	
		
	
		
		
		
		
		
		
		
		

	}
	

}
