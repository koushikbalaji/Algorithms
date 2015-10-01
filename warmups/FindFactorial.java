package Warmups;
import java.math.BigInteger;
import java.util.Scanner;


public class FindFactorial {
	
	static BigInteger fact=BigInteger.valueOf(1);
	/*
	public static BigInteger findFact(int num, BigInteger fact)
	{

		if(num==0)
		{
			fact=BigInteger.valueOf(1);
		}
		else
		{
		for(int i=0;i<num;i++)
		{
		
			fact=findFact(num-1,fact).multiply(BigInteger.valueOf(num));
			
		}
		System.out.println(fact);
		}
		
		return fact;
	}
*/
	
	public static BigInteger findFactorial(int num)
	{
		if(num==0)
		{
			fact=BigInteger.valueOf(1);
		}
		else
			fact=BigInteger.valueOf(num).multiply(findFactorial(num-1));
		return fact;
	}
	public static void main(String ar[])
	{
		
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		
		System.out.println(findFactorial(num));
		
		scan.close();
		
	}
}


