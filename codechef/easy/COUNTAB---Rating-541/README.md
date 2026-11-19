# COUNTAB - Rating 541

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Counting Characters

Chef has a string $S$ of length $N$ consisting only of characters `'a'` and `'b'`.

Find the number of `'a'`s and `'b'`s in $S$.

### Input Format
- The first line contains a single integer $T$ — the number of test cases.
- The first line of each test case contains an integer $N$ — the length of the string.
- The second line contains the string $S$.
### Output Format

For each test case, print two space-separated integers — the count of `'a'` and the count of `'b'` in $S$.

### Constraints
- $1 \leq T \leq 10^4$
- $1 \leq N \leq 10$
- $S$ consists only of 'a' and 'b'.
### Sample 1:
Input
Output

```
3
4
aabb
3
bbb
5
ababa
```

```
2 2
0 3
3 2
```

### Explanation:
- Test case $1$: aabb has $2$ 'a's and $2$ 'b's.
- Test case $2$: bbb has $0$ 'a's and $3$ 'b's.
- Test case $3$: ababa has $3$ 'a's and $2$ 'b's.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T14:25:12.969Z  

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
		    int n=sc.nextInt();
		    String s=sc.next();
		     int countA = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == 'a') {
                        countA++;
                    }
                }
                int countB = n - countA;
                System.out.println(countA + " " + countB);
		     
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/COUNTAB)