import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
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

	}
}
