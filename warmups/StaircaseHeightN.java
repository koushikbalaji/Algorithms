package Warmups;
import java.util.Scanner;


public class StaircaseHeightN {

	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		
		int height=scan.nextInt();
		
		String hash="#";
		String space=" ";
		
		int l=1;
		int length=1;
		for(int i=1;i<=height;i++)
		{
			for(int j=l;j<=height-1;j++)
			{
				System.out.print(space);
			}
				
			for(int k=1;k<=length;k++)
			{
				System.out.print(hash);
			}
				
			System.out.println();
			l++;
			length++;
			
		}
		
		scan.close();
		
	}
	
}
