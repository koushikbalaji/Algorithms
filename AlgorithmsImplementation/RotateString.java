
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RotateString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt();
        String word=scan.next();
        int key=scan.nextInt();
        if(key>26)
        {
        	key=key%26;
        }
        char[] words=word.toCharArray();
        for(int i=0;i<words.length;i++)
        {
           if(Character.isLetter(words[i]))
           {
        	   if(Character.isUpperCase(words[i]))
        			   {
        		   		int num=(int)words[i];
        		   		if(num+key<91)
        		   		{
        		   			System.out.print((char)(words[i]+key));
        		   		}
        		   		else
        		   		{
        		   			int extra=num+key-90;
        		   			System.out.print((char)('A'+extra-1));
        		   		}
        			   }
        	   else
        	   {
        		   int num=(int)words[i];
   		   		if(num+key<123)
   		   		{
   		   			System.out.print((char)(words[i]+key));
   		   		}
   		   		else
   		   		{
   		   			int extra=num+key-122;
   		   			System.out.print((char)('a'+extra-1));
   		   		}  
        	   }
           }
           else
           {
        	  System.out.print(words[i]); 
           }
        }
    }
}
