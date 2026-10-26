# Dynamic Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

- Declare a 2-dimensional array, $arr$, with $n$ empty arrays, all zero-indexed.
- Declare an integer, $lastAnswer$, and initialize it to 0.

You need to process two types of queries:

1. Query: $1\ x\ y$
   - Compute $idx = (x \oplus lastAnswer) % n$.
   - Append the integer $y$ to $arr[idx]$.

2. Query: $2\ x\ y$
   - Compute $idx = (x \oplus lastAnswer) % n$.
   - Set $lastAnswer = arr[idx][y \% size(arr[idx])]$.
   - Store the new value of $lastAnswer$ in an answers array.

**Notes:**  
- $\oplus$ is the *bitwise XOR* operation, which corresponds to the `^` operator in most languages. Learn more about it on [Wikipedia](https://en.wikipedia.org/wiki/Exclusive_or).  
- $\%$ is the modulo operator.   
- Finally, $size(arr[idx])$ is the number of elements in $arr[idx]$.  

**Function Description**  

Complete the $dynamicArray$ function with the following parameters:  
- $int\ n$: the number of empty arrays to initialize in $arr$  
- $int\ queries[q][3]$: 2-D array of integers

**Returns**  

- $int[]$:  the results of each type 2 query in the order they are presented  

**Input Format**

The first line contains two space-separated integers, $n$, the size of $arr$ to create, and $q$, the number of queries, respectively.		
Each of the $q$ subsequent lines contains a query string, $queries[i]$.

**Constraints**

- $1 \leq  n, q \leq  10^5$
- $0 \leq x, y \leq 10^9$
- It is guaranteed that query type $2$ will never query an empty array or index.

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T11:53:29.432Z  

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
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    // Write your code here
    List<List<Integer>> arr = new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        arr.add(new ArrayList<>());
        
    }
    List<Integer> ans=new ArrayList<>();
    int lastAns=0;
    for(List<Integer> query :queries)
    {
        int type=query.get(0);
        int x=query.get(1);
        int y=query.get(2);
        int idx=(x^lastAns)%n;
        if(type==1)
        {
            arr.get(idx).add(y);
        }
        else if(type ==2)
        {
             List<Integer> seq=arr.get(idx);
              lastAns=seq.get(y%seq.size());
              ans.add(lastAns);
        }
    }
    return ans;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.dynamicArray(n, queries);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/dynamic-array/problem)