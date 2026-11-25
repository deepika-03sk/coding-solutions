import java.util.*;

class Codechef {
    static long dist(long r1, long c1, long r2, long c2) {
        return Math.max(Math.abs(r1-r2), Math.abs(c1-c2));
    }

    static long solve(long[] r, long[] c, int mask, int last) {
        if (mask == 15) return 0;

        long ans = Long.MAX_VALUE / 2;

        for (int i = 0; i < 4; i++) {
            if ((mask & (1 << i)) == 0) {
                ans = Math.min(ans,
                    dist(r[last], c[last], r[i], c[i])
                    + solve(r, c, mask | (1 << i), i));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long[] r = {1, 1, n, n};
            long[] c = {1, m, 1, m};

            long ans = Long.MAX_VALUE;

            for (int i = 0; i < 4; i++) {
                ans = Math.min(ans,
                    dist(x, y, r[i], c[i])
                    + solve(r, c, 1 << i, i));
            }

            System.out.println(ans);
        }
    }
}