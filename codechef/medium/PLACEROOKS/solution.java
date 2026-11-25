import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int best = 0, bx = 0, by = 0;

            for (int x = 0; x <= n; x++) {
                for (int y = 0; y <= m; y++) {
                    if (x + 2 * y <= n && 2 * x + y <= m) {
                        int k = 2 * x + 2 * y
                              + Math.min(n - x - 2 * y,
                                         m - 2 * x - y);

                        if (k > best) {
                            best = k;
                            bx = x;
                            by = y;
                        }
                    }
                }
            }

            char[][] a = new char[n][m];

            for (int i = 0; i < n; i++)
                Arrays.fill(a[i], '.');

            // Two rooks in selected rows
            for (int i = 0; i < bx; i++) {
                a[i][2 * i] = 'R';
                a[i][2 * i + 1] = 'R';
            }

            // Two rooks in selected columns
            for (int j = 0; j < by; j++) {
                int col = 2 * bx + j;
                a[bx + 2 * j][col] = 'R';
                a[bx + 2 * j + 1][col] = 'R';
            }

            // Place remaining rooks singly
            int row = bx + 2 * by;
            int col = 2 * bx + by;

            while (row < n && col < m) {
                a[row][col] = 'R';
                row++;
                col++;
            }

            System.out.println(best);

            for (int i = 0; i < n; i++) {
                System.out.println(new String(a[i]));
            }
        }
    }
}