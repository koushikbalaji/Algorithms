package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlternatingCharacters {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan=new Scanner(System.in);
    	int testCases=scan.nextInt();
		
		for(int tescCase=0;tescCase<=testCases;tescCase++)
		{
			String text=scan.next();
			int counter=0;
			for(int i=0;i<text.length()-1;i++)
			{
				if(text.charAt(i)==text.charAt(i+1))
					counter++;
			}
			System.out.println(counter);
		}
    }
}
