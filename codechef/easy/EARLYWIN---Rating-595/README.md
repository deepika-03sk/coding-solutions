# EARLYWIN - Rating 595

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Early Certificates

The Chefland tennis tournament has reached its final match. The two finalists' names are given by the two strings $A$ and $B$, of lengths $N$ and $M$ respectively.
It is guaranteed that $A$ and $B$ contain only lowercase English characters, and they also start with the same letter.

The organizers want to engrave the winner's name on the trophy as soon as possible.
However, since the match has not begun yet, they decide to do the best they possibly can: only engrave the part of the name that is guaranteed to be correct regardless of who wins.
Thus, the organizers will engrave the longest string that appears at the beginning of both $A$ and $B$ onto the trophy.

Given $A$ and $B$, determine the string engraved on the trophy before the match starts.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of three lines of input. The first line of each test case contains two space-separated integers $N$ and $M$ — the lengths of the names of the finalists. The second line contains a string $A$ of length $N$, denoting the name of the first finalist. The third line contains a string $B$ of length $M$, denoting the name of the second finalist.
### Output Format

For each test case, output on a new line the answer: the string engraved on the trophy before the final begins.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N, M \leq 100$
- $A$ has length $N$ and $B$ has length $M$.
- The first characters of $A$ and $B$ are equal.
- $A$ and $B$ contain only lowercase English letters, i.e. characters from the set $\{a, b, \ldots, z\}$. This corresponds to ASCII values $97-122$.
### Sample 1:
Input
Output

```
4
5 6
alice
alonso
7 4
chefina
chef
16 13
matteoberrettini
matteoarnaldi
6 5
flavio
felix

```

```
al
chef
matteo
f

```

### Explanation:

 **Test case $1$:**  The players are $\texttt{alice}$ and $\texttt{alonso}$.
The longest common starting string of their names is the first two characters, i.e. $\texttt{al}$. So, this is the answer.

 **Test case $2$:**  The players are $\texttt{chefina}$ and $\texttt{chef}$.
The longest common starting string of their names is the first four characters, i.e. $\texttt{chef}$. So, this is the answer. Note that this is also the entire name of the second player; which is fine.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-17T12:13:32.243Z  

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
		    int m=sc.nextInt();
		    String a=sc.next();
		    String b=sc.next();
		   StringBuilder ans = new StringBuilder();
                int limit = Math.min(n, m);
                for (int i = 0; i < limit; i++) {
                    if (a.charAt(i) == b.charAt(i)) {
                        ans.append(a.charAt(i));
                    } else {
                        break;
                    }
                }
                System.out.println(ans.toString());
            
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/EARLYWIN)