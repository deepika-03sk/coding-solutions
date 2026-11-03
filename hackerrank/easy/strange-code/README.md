# Strange Counter

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

There is a *strange counter*. At the first second, it displays the number $3$. Each second, the number displayed by decrements by $1$ until it reaches $1$. In next second, the timer resets to $2 \times \text{the initial number for the prior cycle}$ and continues counting down. The diagram below shows the counter values for each time $t$ in the first three cycles:

<img src="https://s3.amazonaws.com/hr-challenge-images/22185/1469447349-bae87a5071-strange1.png" title="strange(1).png" />

Find and print the value displayed by the counter at time $t$.  

**Function Description**  

Complete the *strangeCounter* function in the editor below.  

strangeCounter has the following parameter(s):  

- *int t:* an integer   

**Returns**  

- *int:* the value displayed at time $t$  

**Input Format**

A single integer, the value of $t$.

**Constraints**

* $1 \le t \le 10^{12}$

**Subtask**

* $1 \le t \le 10^{5}$ for $60 \%$ of the maximum score.

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T07:00:50.061Z  

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'strangeCounter' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER t as parameter.
     */

    public static long strangeCounter(long t) {
    // Write your code here
    long start = 3;
    
    while(t > start) {
        t = t - start;
        start = start * 2;
    }

    return start - t + 1;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strange-code/problem)