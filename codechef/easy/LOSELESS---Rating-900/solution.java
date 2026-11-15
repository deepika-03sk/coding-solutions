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
		    int m=sc.nextInt();
		    int n=sc.nextInt();
   int ans = m;

            for(int w = 0; w <= m; w++)
            {
                for(int tie = 0; tie <= m-w; tie++)
                {
                    if(3*w + tie == n)
                    {
                        ans = Math.min(ans, m-w-tie);
                    }
                }
            }

            System.out.println(ans);
		}

	}
}
