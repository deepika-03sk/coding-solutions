import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
           Arrays.sort(a);
           int max=a[n-1];
           int sec=0;
            for(int i=n-2;i>=0;i--)
            {
                if(a[i]!=max)
                {
                    sec=a[i];
                    break;
                    
                }
            }
           System.out.println(max+sec);
        }
    }
}
