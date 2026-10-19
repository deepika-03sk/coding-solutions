import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    	int x=sc.nextInt();
		    		int y=sc.nextInt();
		    	int exp=30*y;
		    	if(exp<=x)
		    	{
		    	    System.out.println("YES");
		    	}
		    	else{
		    	    System.out.println("NO");
		    	}
		}

	}
}
