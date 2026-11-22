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
		     int n = sc.nextInt(); // Number of airplanes
            int[] freq = new int[1440]; // Minutes from 0 to 1439
            
            // Read arrival times and count them
            for (int i = 0; i < n; i++) {
                int arrival = sc.nextInt();
                freq[arrival]++;
            }
            
            // Read departure times and count them
            for (int i = 0; i < n; i++) {
                int departure = sc.nextInt();
                freq[departure]++;
            }
            
            // Find the maximum planes using runways at the same minute
            int maxRunways = 0;
            for (int i = 0; i < 1440; i++) {
                if (freq[i] > maxRunways) {
                    maxRunways = freq[i];
                }
            }
            
            System.out.println(maxRunways);
        
		}

	}
}
