import java.util.Scanner;

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
            
            int max1=0;
            int max2=0;
         
            
            for (int i=0;i<n;i++)
           
            {
              int  x=a[i];
                if(x>max1)
                {
                    max2=max1;
                    max1=x;
                }
                else if(x<max1 && x>max2)
                {
                    max2=x;
                }
            }
            System.out.println(max1 + max2);

            
        }
    }
}
