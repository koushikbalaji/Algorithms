package Strings;

import java.util.Scanner;

public class Palindrome {

	
	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int testCases=scan.nextInt();
		for(int i=0;i<testCases;i++) 
		EACH:
		{
		String str=scan.next();
		if(str.equals(new StringBuilder(str).reverse().toString()))
		{
			System.out.println("-1");
			break EACH;
		}
		int k=str.length()-1;
		for(int j=0;j<(str.length())/2;j++)
		{
			if(!(str.charAt(j)==str.charAt(k)))
			{
				StringBuilder sb=new StringBuilder(str);
				sb.deleteCharAt(j);
				str=sb.toString();
				if(str.equals(new StringBuilder(sb).reverse().toString()))
				{
					System.out.println(j);
					break EACH;
				}
				else
				{
					System.out.println(k);
					break EACH;
				}
			}
			k--;
		}
		}
	}
}
