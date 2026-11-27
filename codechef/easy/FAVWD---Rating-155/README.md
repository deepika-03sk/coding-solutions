# FAVWD - Rating 155

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Favorite Words

Chef loves his own name. So, he likes a word if and only if it either starts with the letter `'c'`, or ends with the letter `'f'` (or both).

You are given a string $S$ that represents a four-letter word.
$S$ contains only lowercase English letters.

Does Chef like the word represented by string $S$?

### Input Format
- The only line of input will contain a string $S$, consisting of four lowercase English letters.
### Output Format

Output a single string denoting the answer: `Yes` if Chef likes the given word, and `No` otherwise.

Each letter of the output may be printed in either uppercase or lowercase, i.e. the strings `NO`, `No`, `nO`, and `no` will be treated as equivalent.

### Constraints
- $S$ has length $4$
- Each character of $S$ is one among $\{a, b, \ldots, z\}$.
### Sample 1:
Input
Output

```
chef

```

```
Yes

```

### Explanation:

`"chef"` starts with `c` and ends with `f`, so Chef likes the word.

### Sample 2:
Input
Output

```
claw

```

```
Yes

```

### Explanation:

`"claw"` starts with `c`, so Chef likes the word.

### Sample 3:
Input
Output

```
ofcy

```

```
No

```

### Explanation:

`"ofcy"` neither starts with `c` nor ends with `f`, so Chef doesn't like the word.

### Sample 4:
Input
Output

```
hoof

```

```
Yes

```

### Explanation:

`"hoof"` ends with `f`, so Chef likes the word.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T14:43:07.279Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (s.startsWith("c") || s.endsWith("f")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FAVWD)