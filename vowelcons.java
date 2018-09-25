import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) 
	{
	char ch;	// your code goes char ch;
        Scanner scan = new Scanner(System.in);
		
      
        ch = scan.next().charAt(0);
		
        if(ch=='a' || ch=='e' ||
        ch=='i'|| ch=='o' ||
        ch=='u')
        {
            System.out.print(" Vowel");
        }
        else if(ch=='f')
        {
            System.out.print("Consonant");
        	
        }
            else
            {
            	System.out.println("invalid");
            }
            
        }
    }

	
 
	
