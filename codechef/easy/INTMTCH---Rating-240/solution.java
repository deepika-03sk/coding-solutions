import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(Math.abs(x-y)<=2)
		{
		    System.out.println("Interesting");
		    
		}
		else{
		    System.out.println("Boring");
		}

	}
}
