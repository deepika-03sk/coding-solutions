import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int[] a=new int[2*n];
		    for(int i=0;i<2*n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		      int Sum = 0;
                for (int i = 0; i < n; i++) {
                    Sum += Math.max(a[i], a[2 * n - 1 - i]);
                }
                System.out.println(Sum);
		    
		}

	}
}
