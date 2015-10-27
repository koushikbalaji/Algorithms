import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutTheSticks {

	public static void printSticks(ArrayList<Integer> sticks)
	{
		if(sticks.size()>0)
		{
  		int min=(int) Collections.min(sticks);
  		System.out.println(sticks.size());
      int size=sticks.size();
  		for(int i=0;i<size;i++)
  		{
  			if(sticks.get(i)-min>0)
  			  sticks.set(i, sticks.get(i)-min);
  			else
        {    
          sticks.remove(i);
          size--;
          i--;
          }
  		}
              printSticks(sticks);
		}
		else
		{
			return;
		}
		
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        ArrayList<Integer> sticks=new ArrayList();
        for(int i=0;i<number;i++)
            sticks.add(scan.nextInt());
        printSticks(sticks);
    }
}
