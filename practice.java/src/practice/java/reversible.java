package practice.java;

public class reversible {
	
	public static String Reverse(String str)
	{
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			
			rev=rev+str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		
		System.out.println(reversible.Reverse("Ankit"));
		

	}

}
