import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    long a=sc.nextLong();
		    int dig;
		    int sum=0;
		    while(a>0)
		    {
		        dig=(int)(a % 10);
		        sum=dig+sum;
		        a=a/10;
		    }
		    if(sum%10==0)
		    {
		        System.out.println("Valid");
		    }
		    else{
		        System.out.println("Invalid");
		    }
		}

	}
}
