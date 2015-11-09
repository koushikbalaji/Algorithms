
import java.util.ArrayList;
import java.util.Scanner;

public class MorganandString {

	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int testCases= scan.nextInt();
		for(int i=0;i<testCases;i++)
		{
			String jackString=scan.next();
			String danielString=scan.next();
			ArrayList<Character> jack=new ArrayList<Character>(jackString.length());
			ArrayList<Character> daniel=new ArrayList<Character>(danielString.length());
			
			for(int j=jackString.length()-1;j>=0;j--)
				jack.add(jackString.charAt(j));
			for(int j=danielString.length()-1;j>=0;j--)
				daniel.add(danielString.charAt(j));
				
//			String outputString="";
		
			while(!(jack.isEmpty()||daniel.isEmpty()))
				{
				if(jack.get(jack.size()-1)<daniel.get(daniel.size()-1))
					{
//					outputString=outputString+jack.get(jack.size()-1);
					System.out.print(jack.get(jack.size()-1));
					jack.remove(jack.size()-1);
					}
				else if(jack.get(jack.size()-1)>daniel.get(daniel.size()-1))
					{
//					outputString=outputString+daniel.get(daniel.size()-1);
					System.out.print(daniel.get(daniel.size()-1));
					daniel.remove(daniel.size()-1);	
					}
					else
					{
						int jackSize=jack.size();
						int danielSize=daniel.size();
					while((jackSize!=0&&danielSize!=0)&&(jack.get(jackSize-1)==daniel.get(danielSize-1)))
					{
						jackSize--;
						danielSize--;
						
					}
					if(jackSize==0||danielSize==0)
					{
						if(jackSize==0)
						{
//							outputString=outputString+jack.get(jack.size()-1);
							System.out.print(jack.get(jack.size()-1));
							jack.remove(jack.size()-1);
						}
						else
						{
//							outputString=outputString+daniel.get(daniel.size()-1);
							System.out.print(daniel.get(daniel.size()-1));
							daniel.remove(daniel.size()-1);	
						}
					}
					else
						{
						if(jack.get(jackSize-1)<daniel.get(danielSize-1))
							{
//							outputString=outputString+jack.get(jack.size()-1);
							System.out.print(jack.get(jack.size()-1));
							jack.remove(jack.size()-1);
							}
						else
							{
//							outputString=outputString+daniel.get(daniel.size()-1);
							System.out.print((daniel.get(daniel.size()-1)));
							daniel.remove(daniel.size()-1);	
							}
						}
					}
				}
			if(jack.size()==0||daniel.size()==0)
			{
				if(jack.size()==0)
				{
					for(int j=daniel.size()-1;j>=0;j--)
//						outputString=outputString+daniel.get(j);
						System.out.print(daniel.get(j));
				}
				else
				{	
					for(int j=jack.size()-1;j>=0;j--)
//						outputString=outputString+jack.get(j);
						System.out.print(jack.get(j));
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
