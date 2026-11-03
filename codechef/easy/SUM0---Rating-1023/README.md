# SUM0 - Rating 1023

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Sum to 0

You are given an integer $N$.

Construct an array $A$ of size $N$, with all non-zero elements, such that the sum of elements is $0$ and that the absolute values of all elements do not exceed $3$.

Formally, find an array $A$ of $N$ elements such that:

- $A_1 + A_2 + \ldots + A_N = 0$
- $|A_i|$ is either $1$, $2$ or $3$.

If multiple answers exist, all will be accepted. If no answer exists, print $-1$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first and only line of each input contains $N$ - the size of the array.
### Output Format

For each test case, output on a new line $N$ integers, $A_1, A_2, \ldots A_N$ satisfying the conditions or $-1$ if no solution.

If multiple answer exists, all will be accepted.

### Constraints
- $1 \le T \le 50$
- $1 \le N \le 50$
### Sample 1:
Input
Output

```
3
1
2
3

```

```
-1
3 -3
1 2 -3

```

### Explanation:

 **Test Case 1**  : There exists no valid arrays of size $1$.

 **Test Case 2**  : The arrays $[1, -1]$, $[-1, 1]$, $[2, -2]$, $[-2, 2]$, $[3, -3]$ and $[-3, 3]$ are all accepted.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T15:21:02.459Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SUM0)