package practice.java;

import java.util.Scanner;

public class bt {
	
	
	public static void main(String[]args)
	{
		
		Scanner sc=new Scanner(System.in);
		int n;
		int arr[]=new int[5];
		int k=4;
		n=sc.nextInt();
		int f=0;
		for(int i=0;i<n;i++)
		{
			
			arr[i]=sc.nextInt();
			
			
		}
		for(int j=0;j<arr.length;j++)
		{
			if(k==arr[j])
			{
				
				f=j;
				break;
			}
			
			
		}
		
		if(f==0)
		{
			
			System.out.println("f not present");
		}
		else
		{
			
			System.out.println("f is present" +f);
		}
	
		
		
		

		
	}
	

}

