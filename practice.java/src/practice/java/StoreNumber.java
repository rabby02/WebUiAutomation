package practice.java;
import java.util.ArrayList;
import java.util.Collections;
public class StoreNumber {

	public static void main(String[] args) {
		
		//Online rostrum//
		ArrayList<Integer>arr=new ArrayList<Integer>();
		arr	.add(1);
		arr.add(26);
		arr.add(34);
		arr.add(3);
		arr.add(7);
		arr.add(2);
		Collections.sort(arr);
		for(int i: arr)
		{
			
			System.out.println(arr.get(i));
		}
	}
	
}
	

	

