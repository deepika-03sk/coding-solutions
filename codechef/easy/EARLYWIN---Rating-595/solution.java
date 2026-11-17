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
		    int m=sc.nextInt();
		    String a=sc.next();
		    String b=sc.next();
		   StringBuilder ans = new StringBuilder();
                int limit = Math.min(n, m);
                for (int i = 0; i < limit; i++) {
                    if (a.charAt(i) == b.charAt(i)) {
                        ans.append(a.charAt(i));
                    } else {
                        break;
                    }
                }
                System.out.println(ans.toString());
            
		}

	}
}
