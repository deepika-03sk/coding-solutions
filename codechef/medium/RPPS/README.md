# RPPS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Repeating Pairs

You are given a string $S$ consisting of lowercase English letters.

For every two adjacent characters in $S$, consider the pair they form. For example, the string `abca` contains the pairs `ab`, `bc`, and `ca`.

A pair is called  **repeating**  if it appears at least twice in the string.

Find the  **number of distinct repeating pairs**  in $S$.

For example, in `ababcabc`, the pair `ab` appears $3$ times and `bc` appears $2$ times, so the answer is $2$.

### Input Format
- The first line contains the string $S$.
### Output Format
- Print a single integer — the number of distinct consecutive character pairs that appear more than once.
### Constraints
- $1 \le |S| \le 10^5$
- $S$ consists only of lowercase English letters.
### Sample 1:
Input
Output

```
ababcabc
```

```
2
```

### Explanation:

The consecutive pairs are:

`ab`, `ba`, `ab`, `bc`, `ca`, `ab`, `bc`

The pair `ab` appears $3$ times and `bc` appears $2$ times.

Therefore, there are  **2**  distinct repeating pairs.

### Sample 2:
Input
Output

```
aaaa
```

```
1
```

### Explanation:

The consecutive pairs are:

`aa`, `aa`, `aa`

Only the pair `aa` appears more than once.

Therefore, the answer is  **1**.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T16:36:06.453Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int[] a=new int[676];
	for(int i=0;i<s.length()-1;i++)
	{
	    int x=s.charAt(i)-'a';
	     int y=s.charAt(i+1)-'a';
	     int index= x*26+y;
	     a[index]++;
	}
	int c=0;
	for(int i=0;i<676;i++)
	{
	    if(a[i]>1)
	    {
	        c++;
	    }
	}
	System.out.println(c);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RPPS)