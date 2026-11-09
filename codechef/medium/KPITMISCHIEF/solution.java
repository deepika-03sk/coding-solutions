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
		String s=sc.next();
		int max=0,st=0,end=0,currst=0,currlen=0;
		for(int i=0;i<n;i++)
		{
		    if(s.charAt(i)=='m')
		    {
		        if(currlen==0)
		        
		            currst=i;
		            currlen++;
		        
		    }
		    else{
		        if(currlen>max)
		        {
		            max=currlen;
		            st=currst;
		            end=i-1;
		        }
		        currlen=0;
		    }
		}
		if(currlen > max)
		{
		    st=currst;
		    end=n-1;
		}
		System.out.println(st + " " + end);

	}
}
