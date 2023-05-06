package ineuron.com;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		boolean b=anagram(input1,input2);
		if(b)
		{
			System.out.println("Given Strings are Anagram");
		}
		else
		{
			System.out.println("Given Strings are not Anagram");
		}
		
	}
	public static boolean anagram(String input1,String input2)
	{
		input1=input1.replace(" ","");
		input2=input2.replace(" ", "");
		if(input1.length()!=input2.length())
		{
			return false;
		}
		else
		{
			char[] ch1=new char[input1.length()];
			char[] ch2=new char[input2.length()];
			for(int i=0;i<input1.length();i++)
			{
				ch1[i]=input1.charAt(i);
			}
			for(int i=0;i<input2.length();i++)
			{
				ch2[i]=input2.charAt(i);
			}
			sortingCharArray(ch1);
			sortingCharArray(ch2);
			String s1=new String(ch1);
			String s2=new String(ch2);
			boolean b=equalsMethod(s1,s2);
			return b;
		}	
		
	}
	public static boolean equalsMethod(String s1,String s2)
	{
		boolean flag=true;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	public static void sortingCharArray(char[] ch)
	{
		for(int i=0;i<ch.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[j]<ch[min])
					min=j;
			}
			if(min!=i)
			{
				char temp=ch[i];
				ch[i]=ch[min];
				ch[min]=temp;
			}
		}
	}

}
