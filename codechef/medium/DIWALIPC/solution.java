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
		int p=sc.nextInt();
		int d=sc.nextInt();
		int k=sc.nextInt();
		int b=sc.nextInt();
		int cost=p+(d*k);
		
		if(b>=cost)
		{
		    System.out.println("Yes");
		}
		else{
		    System.out.println("NO");
		}

	}
	}
}
