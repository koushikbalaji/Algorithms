package AlgoImplementation;

import java.util.Scanner;

public class GridSearch {
	
	public static void findPattern(String[] grid,String[] pattern)
	{
		int i=0;
		int currIndex=-1,prevIndex=-1;
		long check=0l;
			for(int j=0;j<grid.length;j++)
			{
				if(check==1l)
					currIndex=grid[j].indexOf(pattern[i]);
				if(grid[j].contains(pattern[i]))
				{
					if(currIndex==prevIndex)	
					{	check=1;
							prevIndex=grid[j].indexOf(pattern[i]);
							if(i==pattern.length-1)
							{
								System.out.println("YES");
								return;
							}
							else{
							i++;
							}
						}
					else
					{
						if(prevIndex!=-1)
							{
							grid[prevIndex]="a";
							j--;
							if(i>0)
							i--;
							check=0;
							prevIndex=-1;
							currIndex=-1;
							}
					}
					}
				
				else if(j==grid.length-1)
					{
						System.out.println("NO");
						return;
					}
				else
				{ 	
					if(i>0)
					i--;
				}
			}
	}

	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		for(int i=0;i<number;i++)
		{
			int gridRow=scan.nextInt();
			String[] gridString=new String[gridRow];
			for(int j=0;j<gridRow;j++)
			{
				gridString[j]=scan.next();
			}
			
			int patternRow=scan.nextInt();
			String[] patternString=new String[patternRow];
			for(int row=0;row<patternRow;row++)
			{
				patternString[row]=scan.next();
			}
			
			findPattern(gridString,patternString);
		}
	}
}
