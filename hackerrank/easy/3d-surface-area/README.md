# Strange Counter

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Madison is a little girl who is fond of toys. Her friend Mason works in a toy manufacturing factory . Mason has a 2D board $A$ of size $H \times W$ with $H$ rows and $W$ columns. The board is divided into cells of size $1 \times 1$ with each cell indicated by its coordinate $(i, j)$. The cell $(i, j)$  has an integer $A_{ij}$ written on it. To create the toy Mason stacks $A_{ij}$ number of cubes of size $1 \times 1 \times 1$ on the cell $(i, j)$. 

Given the description of the board showing the values of $A_{ij}$ and that the price of the toy is equal to the 3d surface area find the price of the toy. 


**Input Format**

The first line contains two space-separated integers $H$ and $W$ the height and the width of the board respectively.

The next  $H$ lines contains $W$ space separated integers. The $j^{th}$ integer in $i^{th}$ line denotes $A_{ij}$.


**Constraints**

- $1 \le H, W \le 100$
- $1 \le A_{i,j} \le 100$


**Output Format**

Print the required answer, i.e the price of the toy, in one line.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T07:00:56.434Z  

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

[View on HackerRank](https://www.hackerrank.com/challenges/3d-surface-area/problem)