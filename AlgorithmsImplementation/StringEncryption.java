package AlgoImplementation;

import java.util.Scanner;

public class StringEncryption {

	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		String text=scan.next();
		Integer length=text.length();
		int rows=(int) Math.floor(Math.sqrt(length.doubleValue()));
		int col=(int) Math.ceil(Math.sqrt(length.doubleValue()));
		if(rows*col<length)
		{
			rows=rows+1;
		}
		char[][] chars=new char[rows][col];
		for(int r=0;r<rows;r++)
			for(int c=0;c<col;c++)
				chars[r][c]=' ';
		int counter=0;
		for(int r=0;r<rows;r++)
			for(int c=0;c<col;c++)
			{
				if(counter<text.length())
				chars[r][c]=text.charAt(counter);
				counter++;
			}
		
		for(int c=0;c<col;c++)
		{
			for(int r=0;r<rows;r++)
			{
				  if(chars[r][c]!=' ')
				System.out.print(chars[r][c]);
			}
			System.out.print(" ");
		}
	}
}
