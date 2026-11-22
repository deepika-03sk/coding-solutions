# AIRM - Rating 1201

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Airport Management

Chef is building an Airport in Chefland.

There are $N$ airplanes such that the $i^{th}$ airplane arrives at the $A_i$-th minute and departs at the $D_i$-th minute.
Find the  **minimum**  number of runways required at the airport so that all the arrivals and departures can occur smoothly.

 **Note:** 

- Arrival and departure timings are given in minutes after midnight.
- A plane uses the runway only in the minute at which it arrives or departs. Between the arrival and departure times, the runway is available for use by other airplanes.
- One runway can be used by only one airplane at a point in time.
### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line of each test case contains a single integer $N$ — the number of airplanes. The second line of each test case contains $N$ space-separated integers $A_1, A_2, \dots, A_N$ denoting the arrival timings of $i^{th}$ airplane. The third line of each test case contains $N$ space-separated integers $D_1, D_2, \dots, D_N$ denoting the departure timings of $i^{th}$ airplane.
### Output Format

For each test case, output on a new line, the  **minimum**  number of runways required at the airport.

### Constraints
- $1 \leq T \leq 10^4$
- $1 \leq N \leq 10^5$
- $0 \leq A_i \lt D_i \leq 1439$
- The sum of $N$ over all test cases won't exceed $8 \cdot 10^5$.
### Sample 1:
Input
Output

```
3
3
1 1 2
2 2 3
4
1 5 4 3
4 6 10 4
3
1 4 3
2 6 5
```

```
3
3
1
```

### Explanation:

 **Test case 1:**  We require $3$ runways. Let the runways be numbered from $1$ to $3$.

- At time $t = 1$, two airplanes arrive at runways $1$ and $2$ respectively.
- At time $t = 2$, two airplanes depart from runways $1$ and $2$ respectively. Another plane arrives at time $t = 2$. Since both runways $1$ and $2$ are occupied for departure, the plane arrives at runway $3$.

It can be shown that $3$ is the minimum number of runways required at the airport.

 **Test case 2:**  Airport is busiest at time $t = 4$ and requires a minimum of $3$ runways at that time.

 **Test case 3:**  All arrivals and departures are at different times. Thus, only $1$ runway is required at the airport.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T14:46:09.376Z  

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
		     int n = sc.nextInt(); // Number of airplanes
            int[] freq = new int[1440]; // Minutes from 0 to 1439
            
            // Read arrival times and count them
            for (int i = 0; i < n; i++) {
                int arrival = sc.nextInt();
                freq[arrival]++;
            }
            
            // Read departure times and count them
            for (int i = 0; i < n; i++) {
                int departure = sc.nextInt();
                freq[departure]++;
            }
            
            // Find the maximum planes using runways at the same minute
            int maxRunways = 0;
            for (int i = 0; i < 1440; i++) {
                if (freq[i] > maxRunways) {
                    maxRunways = freq[i];
                }
            }
            
            System.out.println(maxRunways);
        
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/AIRM)