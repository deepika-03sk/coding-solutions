# Q1. Count Consistent Subarrays I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

A subarray is called  **consistent**  if the  **bitwise AND**  of all its elements is equal to the  **minimum**  value of the subarray.

Return the number of  **consistent subarrays**  in `nums`​​​​​​​.

A  **subarray**  is a contiguous, non-empty sequence of elements within an array.

 

Original
Java
 **Example 1:** 

 **Input:**  nums = [5,3,1,2]

 **Output:**  6

 **Explanation:** 

The following subarrays are consistent:

Subarray	Values	Bitwise AND	Minimum Value
nums[0..0]	[5]	5	5
nums[1..1]	[3]	3	3
nums[2..2]	[1]	1	1
nums[3..3]	[2]	2	2
nums[1..2]	[3, 1]	3 AND 1 = 1	1
nums[0..2]	[5, 3, 1]	5 AND 3 AND 1 = 1	1

Therefore, the number of consistent subarrays is 6.

 **Example 2:** 

 **Input:**  nums = [1,1,1]

 **Output:**  6

 **Explanation:** 

For every subarray, both the bitwise AND and the minimum value are equal to 1. Therefore, the answer is 6.

 **Example 3:** 

 **Input:**  nums = [0]

 **Output:**  1

 **Explanation:** 

The only subarray is `[0]`, whose bitwise AND and minimum value are both 0. Therefore, the answer is 1.

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 0 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 100.00%)  
**Memory:** 45.8 MB (beats 100.00%)  
**Submitted:** 2026-11-15T03:32:37.120Z  

```java
class Solution {
    public int countConsistent(int[] nums) {
        long c=0;
        for(int i=0;i<nums.length;i++)
        {
            int and=nums[i];
            int min=nums[i];
            for(int j=i;j<nums.length;j++)
            {
                and=and&nums[j];
                min=Math.min(min,nums[j]);
                if(and==min)
                {
                    c++;
                }
            }
        }
        return (int)c;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-consistent-subarrays-i/)