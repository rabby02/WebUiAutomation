package practice.java;

public class StringPalindrome {

	public static String TestPalindrome(String str)
	{


		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{

			rev=rev+str.charAt(i);
		}
		if(str.toLowerCase().equals(rev.toLowerCase()))
		{

			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not Palindrome");

		}
		return rev;
	}





	public static void main(String[] args) {


		System.out.println(StringPalindrome.TestPalindrome("Madam"));













	}

}
