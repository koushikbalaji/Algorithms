package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {

	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int testCases=scan.nextInt();
		for(int i=0;i<testCases;i++)
		EACH:
		{
			String input=scan.next();
			int size=input.length();
			if(input.length()%2!=0)
				{
				System.out.println("-1");
				break EACH;
				}
			String first=input.substring(0,size/2);
			String second=input.substring((size/2),size);
			
			ArrayList<Character> firstList=new ArrayList<Character>();
			ArrayList<Character> secondList=new ArrayList<Character>();
			
			for(int j=0;j<first.length();j++)
			{
				firstList.add(first.charAt(j));
				secondList.add(second.charAt(j));
			}
			
			int counter=0;
			for(int j=0;j<firstList.size();j++)
			{
				if(secondList.contains(firstList.get(j)))
					secondList.remove(secondList.indexOf(firstList.get(j)));
				else
					counter++;
			}
			System.out.println(counter);
		}
	}
}
