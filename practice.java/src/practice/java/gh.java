package practice.java;

public class gh {
	
	static boolean SearcH(int arr[],int k,int n)
	{
		
		
		for(int i=0;i<n;i++)
		{
			
			
			if(arr[i]==k)
			{
				return true;
			}
			
		}
		return false;
	}
	
	
	public static void main(String[]args)
	{
		
		
		int[]arr= {3,4,1,9,5,7};
		int k=9;
		int n=arr.length;
		SearcH(arr,k,n);
		if(false)
		{
			System.out.println("no");
		}
		else
		{
			
			System.out.println("Yes");
		}
		
	}
	
	
	
	
	
	

}
