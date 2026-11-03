# MUFFINS3 - Rating 1023

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Packaging Cupcakes

Now that Chef has finished baking and frosting his cupcakes, it's time to package them. Chef has  **N**  cupcakes, and needs to decide how many cupcakes to place in each package. Each package must contain the same number of cupcakes. Chef will choose an integer  **A**  between 1 and  **N**, inclusive, and place exactly  **A**  cupcakes into each package. Chef makes as many packages as possible. Chef then gets to eat the remaining cupcakes. Chef enjoys eating cupcakes very much. Help Chef choose the package size  **A**  that will let him eat as many cupcakes as possible.

### Input

Input begins with an integer  **T**, the number of test cases. Each test case consists of a single integer  **N**, the number of cupcakes.

### Output

For each test case, output the package size that will maximize the number of leftover cupcakes. If multiple package sizes will result in the same number of leftover cupcakes, print the largest such size.

### Constraints
- 1 ≤ T ≤ 1000
- 2 ≤ N ≤ 100000000 (108)
### Sample 1:
Input
Output

```
2
2
5
```

```
2
3
```

### Explanation:

In the first test case, there will be no leftover cupcakes regardless of the size Chef chooses, so he chooses the largest possible size. In the second test case, there will be 2 leftover cupcakes.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T15:07:49.990Z  

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
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    System.out.println((n/2)+1);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MUFFINS3)