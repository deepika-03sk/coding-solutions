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
		    int k=sc.nextInt();
		    String s=sc.next();
		    int min=1;
		    for(int i=1;i<n;i++)
		    {
		        if(s.charAt(i)!=s.charAt(i-1))
		        {
		            min++;
		        }
		    }
		    if(min<=k)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
