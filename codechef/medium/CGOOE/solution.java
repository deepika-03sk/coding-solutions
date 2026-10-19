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
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int c=0;
		    for(int i=0;i<n;i++)
		    {
		       int  flag=1;
		         for(int j = i - 1; j >= 0 && j >= i - 5; j--)
		         {
		             if(a[i]>=a[j])
		             {
		                 flag=0;
		                 break;
		             }
		         }
		         if(flag==1)
		         {
		             System.out.println(c);
		         }
		         
		    }
		}

	}
}
