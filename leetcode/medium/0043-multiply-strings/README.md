# Multiply Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two non-negative integers `num1` and `num2` represented as strings, return the product of `num1` and `num2`, also represented as a string.

 **Note:**  You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

Original
Java
 **Example 1:** 

```
Input:String num1 = "2";String num2 = "3";Output: "6"

```

 **Example 2:** 

```
Input:String num1 = "123";String num2 = "456";Output: "56088"

```

 

 **Constraints:** 

- 1 <= num1.length, num2.length <= 200
- num1 and num2 consist of digits only.
- Both num1 and num2 do not contain any leading zero, except the number 0 itself.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 9.10%)  
**Memory:** 43.3 MB (beats 46.49%)  
**Submitted:** 2026-11-25T15:20:16.844Z  

```java
class Solution {
    public String multiply(String num1, String num2) {
          int n = num1.length();
        int m = num2.length();
        
        int[] res = new int[n + m];
        
        for(int i = n - 1; i >= 0; i--) {
            for(int j = m - 1; j >= 0; j--) {
                
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                
                int mul = a * b + res[i + j + 1];
                
                res[i + j + 1] = mul % 10;
                res[i + j] += mul / 10;
            }
        }
        
        String ans = "";
        
        for(int i = 0; i < res.length; i++) {
            if(ans.length() == 0 && res[i] == 0) {
                continue;
            }
            ans += res[i];
        }
        
        if(ans.length() == 0) {
            return "0";
        }
        
        return ans;
    
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/multiply-strings/)