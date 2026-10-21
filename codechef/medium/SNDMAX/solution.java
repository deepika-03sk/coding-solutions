import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		int[] a=new int[3];
		for(int j=0;j<3;j++)
		{
		    a[j]=sc.nextInt();
		}
		 Arrays.sort(a);
		 
		 System.out.println(a[1]);
		 
		}
	}
}
