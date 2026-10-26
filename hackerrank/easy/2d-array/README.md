# 2D Array - DS

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a $6 \times 6$ 2D array, $arr$, an hourglass is a subset of values with indices falling in the following pattern:

```
a b c  
  d  
e f g
```

There are $16$ hourglasses in a $6 \times 6$ array. The $hourglass\ sum$ is the sum of the values in an hourglass. Calculate the hourglass sum for every hourglass in $arr$, then print the $maximum$ hourglass sum.

**Example**  

$arr =$

    -9 -9 -9  1 1 1 
	 0 -9  0  4 3 2
	-9 -9 -9  1 2 3
	 0  0  8  6 6 0
	 0  0  0 -2 0 0
	 0  0  1  2 4 0

The $16$ hourglass sums are:

    -63, -34, -9, 12, 
	-10,   0, 28, 23, 
	-27, -11, -2, 10, 
	  9,  17, 25, 18
    
The highest hourglass sum is $28$ from the hourglass beginning at row $1$, column $2$:

    0 4 3
      1
    8 6 6
    
**Note:** If you have already solved the Java domain's *Java 2D Array* challenge, you may wish to skip this challenge.

**Function Description**

Complete the function $hourglassSum$ with the following parameter(s):

- $int\ arr[6][6]$: a 2-D array of integers  

**Returns**  

- $int$: the maximum hourglass sum

**Input Format**

Each of the $6$ lines of inputs $arr[i]$ contains $6$ space-separated integers $arr[i][j]$.

**Constraints**

- $-9 \le arr[i][j] \le 9$	
- $0 \le i,j \le 5$

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T11:42:44.419Z  

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
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
    int max=Integer.MIN_VALUE;
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++)
        {
            int sum=arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
            max=Math.max(max, sum);
        }
    }
    return max;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/2d-array/problem)