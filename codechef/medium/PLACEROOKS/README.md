# PLACEROOKS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Placing Rooks

You are given an $N \times M$ chessboard. You want to place as many rooks on it as possible, such that  **every rook attacks at most one other rook**.

A rook attacks another rook if they are in the same row or in the same column, and there is no other rook between them.

Find the maximum number of rooks you can place, and print one such placement.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first and only line of each test case contains two space-separated integers $N$ and $M$ — the number of rows and columns of the board.
### Output Format

For each test case, output on a new line the maximum number of rooks $K$.

Then, output $N$ lines, each containing a string of length $M$. The $j$-th character of the $i$-th of these lines should be `R` if there is a rook in row $i$ and column $j$, and `.` otherwise.

If there are multiple valid placements with $K$ rooks, you may print any of them.

### Constraints
- $1 \leq T \leq 100$
- $2 \leq N, M \leq 100$
### Sample 1:
Input
Output

```
3
2 2
3 3
2 5

```

```
2
R.
.R
4
R..
R..
.RR
4
RR...
..RR.

```

### Explanation:

 **Test case $1$:**  With three rooks on a $2 \times 2$ board, one rook would share its row with one rook and its column with another, so it would attack two rooks. Two rooks placed diagonally do not attack each other at all.

 **Test case $2$:**  The rooks in cells $(1, 1)$ and $(2, 1)$ attack only each other, and so do the rooks in cells $(3, 2)$ and $(3, 3)$.

 **Test case $3$:**  A row can hold at most $2$ rooks (with three rooks in a row, the middle one attacks two rooks), so $4$ rooks is the maximum.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T15:16:41.060Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/PLACEROOKS)