import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes hereimport java.util.Scanner;


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int oddFirstMismatches = 0;

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                // For Odd-first pattern: even indices need odd (1), odd indices need even (0)
                if (num % 2 == i % 2) {
                    oddFirstMismatches++;
                }
            }

            // Even-first mismatches is simply (n - oddFirstMismatches)
            int evenFirstMismatches = n - oddFirstMismatches;
            System.out.println(Math.min(oddFirstMismatches, evenFirstMismatches));
        }

       

	}
}
