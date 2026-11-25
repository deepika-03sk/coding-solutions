# DBLDROP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Double and Drop (Easy)

You are given an array $A$ of $N$ positive integers.

You may perform the following operation  **at most once** :

- Choose an index $i$ ($1 \le i \le N$) and set $A_i := 2 \cdot A_i$.

After that, let $f(A)$ be the maximum possible value of $\text{sum}(A) - \max(A)$, that is, the sum of all its elements except one copy of the largest one.

Given an array of $N$ elements, find $f(A)$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$ — the length of the array. The second line contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the maximum possible score $f(A)$.

### Constraints
- $1 \leq T \leq 1000$
- $2 \leq N \leq 5000$
- $1 \leq A_i \leq 10^9$
- The sum of $N$ over all test cases does not exceed $5000$.
### Sample 1:
Input
Output

```
4
3
1 2 3
2
5 5
3
1 6 10
5
7 3 9 2 9

```

```
4
5
11
24

```

### Explanation:

 **Test case $1$:**  Doubling $A_1$ gives $[2, 2, 3]$, with score $7 - 3 = 4$. Doubling $A_2$ gives $[1, 4, 3]$, with score $8 - 4 = 4$ as well. No choice does better.

 **Test case $2$:**  Without the operation, the score is $10 - 5 = 5$. Doubling either element gives score $15 - 10 = 5$.

 **Test case $3$:**  Doubling $A_2$ gives $[1, 12, 10]$. The maximum changes, but the score is $23 - 12 = 11$, which is optimal.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T15:01:03.579Z  

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
		    long[] a=new long[n];
		    long sum=0;
		    long max=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		        sum+=a[i];
		        if(a[i]>max)
		        {
		            max=a[i];
		        }
		    }
		    long ans=sum-max;
		    for(int i=0;i<n;i++)
		    {
		        long dob=2*a[i];
		        long sum1=sum+a[i];
		        long max1=Math.max(max,dob);
		        long sco=sum1-max1;
		        if(sco>ans)
		        {
		            ans=sco;
		        }
		    }
		    System.out.println(ans);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DBLDROP)