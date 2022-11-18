package Day1_Problems;

import java.util.Scanner;

public class Day1_Problem7 
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Year");
		
	    int Year= scan.nextInt();
	
	    if(Year%4==0)
	    {
	    	System.out.println("The Year is leap year");
	    	
	    }
	    else if (Year%100==0)
	    {
	    	System.out.println("Not a leap year");
	    	
	    }
	    else if (Year % 4==0)
	    {
	    	System.out.println("The year is leap year");
	    }
	    else
	    {
	    	System.out.println("Not a leap year");
	    }
	
	}
}
