import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
        
        // Your code goes here
        int c=0,max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                c++;
                if(c>max)
                {
                    max=c;
                }
            }
            else{
                c=0;
            }
        }
        int c1=0,max1=0;
        for(int i=0;i<n;i++)
        {
            if(b[i]!=0)
            {
                c1++;
                if(c1>max1)
                {
                    max1=c1;
                }
            }
            else{
                c1=0;
            }
        }
        if(max>max1)
        {
            System.out.println("Om");
        }
       else if(max1>max)
        {
            System.out.println("Addy");
        }
        else
        {
            System.out.println("Draw");
        }
    }
}
}