import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new SCanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    
		    int n=sc.nextInt();
		    long[] a=new long[n];
		    long sum=0;
		    long max=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		        sum+=a[i];
		        if(a[i]>max)
		        {
		            max=a[i];
		        }
		    }
		    long ans=sum-max;
		    for(int i=0;i<n;i++)
		    {
		        long dob=2*a[i];
		        long sum1=sum+a[i];
		        long max1=Math.max(max,dob);
		        long sco=sum1-max1;
		        if(sco>ans)
		        {
		            ans=sco;
		        }
		    }
		    System.out.println(ans);
		}

	}
}
