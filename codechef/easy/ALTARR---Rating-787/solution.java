import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int oddFirstMismatches = 0;

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num % 2 == i % 2) {
                    oddFirstMismatches++;
                }
            }

            int evenFirstMismatches = n - oddFirstMismatches;
            System.out.println(Math.min(oddFirstMismatches, evenFirstMismatches));
        }

       

	}
}
