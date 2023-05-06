package ineuron.com;
import java.lang.Math;
public class Demo {

	public static void main(String[] args)
	{
		System.out.println(m1(4));

	}
	public static int m1(int n)
	{
		if(n>0)
		{
			int res=(int)Math.pow(n,2);
			return res+ m1(n-1);
		}
		return 0;
	}	
}
