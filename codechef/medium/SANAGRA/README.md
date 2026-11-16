# SANAGRA

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sentence Anagrams

You are developing a feature for a plagiarism detection tool. A simple check determines whether two sentences contain the same words arranged in a different order.

Given two sentences, determine whether they are  **sentence anagrams**. Two sentences are sentence anagrams if they contain exactly the same words with the same frequencies, regardless of letter case or word order.

A  **word**  is a sequence of consecutive English letters (`A`–`Z` or `a`–`z`). All non-letter characters, including spaces, punctuation, and digits, act as separators. For example, `hello-world` contains two words: `hello` and `world`.

If neither sentence contains any words, they are considered anagrams.

### Input Format

The input consists of two lines.

- The first line contains the first sentence.
- The second line contains the second sentence.
### Output Format
- Print "The sentences are anagrams." if the two sentences are anagrams.
- Otherwise, print "The sentences are not anagrams.".
### Constraints
- The length of each sentence is between $1$ and $10^5$ characters, inclusive.
- Each character is a printable ASCII character with a value between $32$ and $126$, inclusive.
- All non-letter characters, including digits, act as word separators.
### Sample 1:
Input
Output

```
The quick brown fox
Brown fox the quick
```

```
The sentences are anagrams.
```

### Explanation:

Both sentences contain the words `the`, `quick`, `brown`, and `fox` exactly once, ignoring case.

### Sample 2:
Input
Output

```
Hello, world! Hello.
WORLD-hello hello
```

```
The sentences are anagrams.
```

### Explanation:

Both sentences contain `hello` twice and `world` once. Punctuation separates the words, and case does not affect the comparison.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-16T14:59:26.997Z  

```java
import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();

        String[] a = s1.split("[^a-z]+");
        String[] b = s2.split("[^a-z]+");

        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < a.length; i++)
        {
            if(!a[i].isEmpty())
                list.add(a[i]);
        }

        for(int i = 0; i < b.length; i++)
        {
            if(!b[i].isEmpty())
            {
                if(list.contains(b[i]))
                    list.remove(b[i]);
                else
                    list.add(b[i]);
            }
        }

        if(list.isEmpty())
            System.out.println("The sentences are anagrams.");
        else
            System.out.println("The sentences are not anagrams.");
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SANAGRA)