package practice.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SwapElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc=new Scanner(System.in);
		int a;
		int b;
		
		a=sc.nextInt();
		b=sc.nextInt();
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(a+" " +b);*/
		
		
		List<Integer>list=new ArrayList<>();
		list.add(4);
		list.add(6);
		list.add(9);
		list.add(90);
		Collections.swap(list, 2, 3);
		System.out.println(list);
		
		
	

		
	}
	
	

}
