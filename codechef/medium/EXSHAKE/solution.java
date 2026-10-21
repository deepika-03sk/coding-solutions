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
		    int m=sc.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    Arrays.sort(a);
		    int ppl=0;
		    int c=0;
		    for(int i=0;i<n;i++)
		    {
		        int tot=ppl+a[i];
		       int  hand=tot*(tot-1)/2;
		        if(hand<=m)
		        {
		            ppl=tot;
		            c++;
		        }
		        else{
		            break;
		        }
		    }
		    System.out.println(c);
		}

	}
}
