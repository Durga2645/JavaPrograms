package ineuron.com;
import java.util.Scanner;
public class VowelsConsonantsFinder {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input =sc.nextLine();
		vowelsConsonants(input);
	}
	public static void vowelsConsonants(String input)
	{
		int vowelsCount=0,consonantsCount=0,specialCount=0;
		 //97, 101, 105, 111, and 117
		//65, 69, 73, 79, and 85
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(((ch >= 65 && ch <= 90)||(ch >=97 && ch <=122)) && (ch==97 || ch==101 || ch==105 || ch==111 || ch==117 || ch==85 || ch==79 || ch==73 || ch==65 || ch== 69))
			{
				vowelsCount++;
			}
			else if((ch >=0 && ch<65) || (ch > 90 && ch < 97) || ch >122 )
			{
				specialCount++;
			}
			else
			{
				consonantsCount++;
			}
		}
		System.out.println("Vowles Count "+vowelsCount );
		System.out.println("Consonants Count "+consonantsCount );
		System.out.println("SpecialCharacters Count "+specialCount );
	}
}
