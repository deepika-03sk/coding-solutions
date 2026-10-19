
import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        int[] dp = new int[s + 1];

        Arrays.fill(dp, s + 1);
        dp[0] = 0;

        for(int i = 1; i <= s; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(a[j] <= i)
                {
                    dp[i] = Math.min(dp[i], dp[i - a[j]] + 1);
                }
            }
        }

        if(dp[s] == s + 1)
            System.out.println(-1);
        else
            System.out.println(dp[s]);
    }
}
