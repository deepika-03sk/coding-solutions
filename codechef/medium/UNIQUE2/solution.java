import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    
		}
		for(int i=00;i<n;i++)
		{
		    int c=0;
		    for(int j=0;j<n;j++)
		    {
		        if(a[i]==a[j])
		        {
		            c++;
		            break;
		        }
		    }
		
		if(c==0)
		{
		System.out.print(a[i] +" ");
		}
	}

	}
}
