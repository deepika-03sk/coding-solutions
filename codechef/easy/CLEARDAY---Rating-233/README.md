# CLEARDAY - Rating 233

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Clear Day

Chef classifies a day to be either `rainy`, `cloudy`, or `clear`.

In a particular  **week**, Chef finds $X$ days to be `rainy` and $Y$ days to be `cloudy`.
Find the number of `clear` days in the week.

### Input Format
- The first and only line of input will contain two space-separated integers $X$ and $Y$, denoting the number of rainy and cloudy days in the week.
### Output Format

Output the number of clear days in the week.

### Constraints
- $0 \leq X, Y \leq 7$
- $0 \leq X+Y \leq 7$
### Sample 1:
Input
Output

```
2 3
```

```
2
```

### Explanation:

There are $7$ days in a week. If there are $2$ rainy days and $3$ cloudy days, then the remaining $7-2-3=2$ days are clear.

### Sample 2:
Input
Output

```
3 4
```

```
0
```

### Explanation:

If there are $3$ rainy days and $4$ cloudy days, then the remaining $7-3-4=0$ days are clear.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T17:23:38.468Z  

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
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x+y==7)
		{
		    System.out.println(0);
		}
		else{
		    System.out.println(7-(x+y));
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLEARDAY)