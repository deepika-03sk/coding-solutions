# LOSELESS - Rating 900

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Lose Less

Chefland is participating in the football world cup.

Every football match played by Chefland has one of three outcomes: Chefland can win, the match can be tied, or Chefland can lose.

- If Chefland wins the match, they will receive $3$ points.
- If the match is tied, they will receive $1$ point.
- If Chefland loses the match, they will receive $0$ points.

Chefland has played $M$ matches so far, and has received a total of $N$ points from these matches.
However, you do not remember how many of these matches were wins, ties, or losses.

Find the  **minimum**  number of losses Chefland could possibly have had, while ending up with exactly $N$ points from $M$ matches.

 **Additional constraint:**  It is guaranteed that for any $(M, N)$ pair given as input, there exists at least one way to attain exactly $N$ points from $M$ matches.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of a single line of input, containing two space two space-separated integers $M$ and $N$ — the number of matches and the number of points Chefland has, respectively.
### Output Format

For each test case, output on a new line the minimum number of losses Chefland could have faced, while ending up with $N$ points from $M$ matches.

### Constraints
- $1 \leq T \leq 1000$
- $1 \le M \le 20$
- $0 \le N \le 3\cdot M$
- It is guaranteed that there exists a way to end up with $N$ points from $M$ matches.
### Sample 1:
Input
Output

```
5
3 3
5 0
6 7
8 22
9 2

```

```
0
5
1
0
7

```

### Explanation:

 **Test case $1$:**  There are $M = 3$ matches and $N = 3$ points. If Chefland ties all three games, they will receive one point from each for a total of $3$ points. This way, there are no losses; so the answer is $0$.

 **Test case $2$:**  There are $M = 5$ matches and $N = 0$ points. The only way to get $0$ points is to lose every match; so the answer is $5$.

 **Test case $3$:**  There are $M = 6$ matches and $N = 7$ points. One way to reach $7$ points from $6$ matches is as follows:

- Win one match, scoring $3$ points.
- Tie four matches, scoring $4$ points in total.
- Lose one match, scoring $0$ points.

This is $1+4+1 = 6$ matches, for a total of $3+4+0 = 7$ points, with only one loss.
It can be verified that reaching $7$ points is impossible with fewer than one loss, so the answer is $1$.

 **Test case $4$:**  One way of reaching $22$ points in $8$ matches is to win $7$ matches and tie one match; so there are no losses.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-15T16:06:38.897Z  

```java
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
		    int m=sc.nextInt();
		    int n=sc.nextInt();
   int ans = m;

            for(int w = 0; w <= m; w++)
            {
                for(int tie = 0; tie <= m-w; tie++)
                {
                    if(3*w + tie == n)
                    {
                        ans = Math.min(ans, m-w-tie);
                    }
                }
            }

            System.out.println(ans);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LOSELESS)