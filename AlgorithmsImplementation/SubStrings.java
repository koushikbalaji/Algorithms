package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubStrings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int testCases=scan.nextInt();
        OUTER:
        for(int i=0;i<testCases;i++)
            {
        	Boolean check=false;
            String first=scan.next();
            String second=scan.next();
            
            for(char c:"abcdefghijklmnopqrstuvwxyz".toCharArray())
            {
            	if(first.contains(Character.toString(c))&&second.contains(Character.toString(c)))
            	{
            		System.out.println("YES");
            		continue OUTER;
            	}
            }
            System.out.println("NO");
            
            /*Set firstSet=new HashSet();
            Set secondSet=new HashSet();

            for(int m=0;m<first.length();m++)
            firstSet.add(first.charAt(m));
            
            for(int m=0;m<second.length();m++)
                secondSet.add(second.charAt(m));
            
            int firstSize=firstSet.size();
            int secondSize=secondSet.size();
            
            firstSet.addAll(secondSet);
            
            if(firstSet.size()==firstSize+secondSize)
            	System.out.println("NO");
            else
            	System.out.println("YES");*/
            
            /*for(int j=0;j<first.length();j++)
                {
                if(second.contains(Character.toString(first.charAt(j))))
                	{
                    System.out.println("YES");
                    check=true;
                    break;
                	}
                }
            if(check==false)
            	System.out.println("NO");*/
            
            }
    	}
}
