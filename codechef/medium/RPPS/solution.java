import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int[] a=new int[676];
	for(int i=0;i<s.length()-1;i++)
	{
	    int x=s.charAt(i)-'a';
	     int y=s.charAt(i+1)-'a';
	     int index= x*26+y;
	     a[index]++;
	}
	int c=0;
	for(int i=0;i<676;i++)
	{
	    if(a[i]>1)
	    {
	        c++;
	    }
	}
	System.out.println(c);

	}
}
