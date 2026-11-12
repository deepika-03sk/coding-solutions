import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int sum=0;
		                int minProfit = Integer.MAX_VALUE;

		    for(int i=0;i<n;i++)
		    
		    {
		        int proft=a[i];
		        sum+=proft;
		    
		    if(minProfit>proft)
		    {
		        minProfit=proft;
		    }
		    }
		    System.out.println(sum-minProfit);
		}

	}
}
