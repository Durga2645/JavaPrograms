package ineuron.com;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String or number : ");
		String input=sc.nextLine();
		boolean b=toCheckPalindrome(input);
		if(b==true)
		{
			System.out.println(input+" it is a Palindrome");
		}
		else
		{
			System.out.println(input+" it is not a Palindrome");
		}
	}
	public static boolean toCheckPalindrome(String input)
	{
		String s2="";
		for(int i=input.length()-1;i>=0;i--)
		{
			s2=s2+input.charAt(i);
		}
		if(s2.equals(input))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
