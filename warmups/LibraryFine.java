package Warmups;
import java.util.Scanner;


public class LibraryFine {

	
	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int actualDate=scan.nextInt();
		int actualMonth=scan.nextInt();
		int actualYear=scan.nextInt();
		int expectedDate=scan.nextInt();
		int expectedMonth=scan.nextInt();
		int expectedYear=scan.nextInt();
		int fine=0;
		
		if(actualYear<=expectedYear)
		{
			if(actualMonth<=expectedMonth)
			{
				if(actualDate<=expectedDate)
				{
					fine=0;
				}
				else
				{
					if(actualMonth<expectedMonth)
					{
						fine=0;
					}
					else{
					fine=15*(actualDate-expectedDate);}
				}
			}
			
			else
			{
				if(actualYear<expectedYear)
				{
					fine=0;
				}
				else{
				fine=500*(actualMonth-expectedMonth);}
			}
		}
		
		else
		{
			fine=10000;
		}
		
		
		System.out.println(fine);
		
		scan.close();
	}
	
}
