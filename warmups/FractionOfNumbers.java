package Warmups;
import java.text.DecimalFormat;
import java.util.Scanner;


public class FractionOfNumbers {
	
	public static void main(String ar[])
	{

		Scanner scan = new Scanner(System.in);
		int length=scan.nextInt();
		Double elements[]=new Double[length];
		for(int i=0;i<length;i++)
		{
			
			elements[i]=scan.nextDouble();	
			
		}
		scan.close();
		
	
	
	Double positive=0.000,negative=0.000,zero=0.000;
	
	for(int i=0;i<elements.length;i++)
	{
		if(elements[i]<0)
		{
			negative++;
		}
		else if(elements[i]>0)
		{
			positive++;
		}
		else {
			zero++;
		}
	}
	
	
	System.out.println(positive+" "+negative+" "+zero);
	
	Double pos=(double) (positive/length);
	Double neg=(double) (negative/length);
	double zeroCount=(double) (zero/length);
	System.out.println((new DecimalFormat("#0.000").format(pos)));
	System.out.println((new DecimalFormat("#0.000").format(neg)));
	System.out.println((new DecimalFormat("#0.000").format(zeroCount)));
	
}
}
