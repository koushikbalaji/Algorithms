package Strings;

import java.util.Scanner;
import java.util.TreeSet;

public class Pangram {

	public static void main(String ar[])
	{
		
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		TreeSet<Character> counter=new TreeSet<Character>();
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)!=' ')
			counter.add(Character.toLowerCase(input.charAt(i)));
		}
		if(counter.size()==26)
			System.out.println("panagrm");
		else
			System.out.println("not panagrm");
	}
}
