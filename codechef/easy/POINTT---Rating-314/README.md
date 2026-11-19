# POINTT - Rating 314

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Points Table

Alice and Bob are playing a two-round game. Each player has a  **primary score**  and a  **secondary score**.

Alice's primary and secondary scores are $X$ and $Y$ respectively. Bob's primary and secondary scores are $A$ and $B$ respectively.

The winner is decided as follows:

- The player with the strictly higher primary score wins.
- If both players have the same primary score, the player with the strictly higher secondary score wins.
- If both scores are equal, Alice wins, as she registered for the game first.

Determine the winner of the game.

### Input Format
- The only line of input contains four space-separated integers $X$, $Y$, $A$, and $B$ — the primary and secondary scores of Alice and Bob respectively.
### Output Format

Output `Alice` if Alice wins, otherwise output `Bob`.

You may print each character of the string in uppercase or lowercase (for example, the strings `aLiCe`, `alice`, `Alice`, and `ALICE` will all be treated as identical).

### Constraints
- $1 \le X, Y, A, B \le 10$
### Sample 1:
Input
Output

```
5 3 4 7
```

```
Alice
```

### Explanation:
- Alice's primary score ($5$) is strictly greater than Bob's ($4$), so Alice wins regardless of secondary scores.
### Sample 2:
Input
Output

```
3 4 3 8
```

```
Bob
```

### Explanation:
- Primary scores are tied ($3 = 3$). Bob's secondary score ($8$) is strictly greater than Alice's ($4$), so Bob wins.
### Sample 3:
Input
Output

```
6 2 6 2
```

```
Alice
```

### Explanation:
- Both primary scores ($6 = 6$) and secondary scores ($2 = 2$) are equal. Alice wins by tiebreaker.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T14:16:43.678Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(x>a || x==a && y>=b)
		
		{
		    System.out.println("Alice");
		}
		else{
		    System.out.println("Bob");
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/POINTT)