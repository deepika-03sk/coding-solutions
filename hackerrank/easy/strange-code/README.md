# Time Conversion

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
**Submitted:** 2026-11-03T06:59:50.490Z  

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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String time = s.substring(0, 8);
    String ampm = s.substring(8);

    int hour = Integer.parseInt(s.substring(0, 2));

    if(ampm.equals("AM")) {
        if(hour == 12) {
            time = "00" + s.substring(2, 8);
        }
    }
    else {
        if(hour != 12) {
            hour = hour + 12;
            time = hour + s.substring(2, 8);
        }
    }

    return time;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strange-code/problem)