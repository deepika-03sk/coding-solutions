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
		    String a=sc.next();
		    int dig;
		    int sum=0;
		  
		    for(int i=0;i<a.length();i++)
		    {
		        sum=sum+(a.charAt(i)-'0');
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
